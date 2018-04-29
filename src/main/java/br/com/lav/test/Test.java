package br.com.lav.test;

import br.com.lav.test.model.Post;
import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.core.Response;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

/**
 * Singleton class, it provide access to generic method
 * 
 * @author laverson
 */
public class Test implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Test instance;
	private final ObjectMapper mapper = new ObjectMapper();
	private static ResteasyClient client;
	private static ResteasyWebTarget target;

	static {
		client = new ResteasyClientBuilder().build();
	}

	protected Test() {
	}

	/***
	 * 
	 * @return
	 */
	public static Test getInstance() {
		if (instance == null) {
			instance = new Test();
		}
		return instance;
	}

	/**
	 * GET all post from web service provided
	 * 
	 * @return Post[]
	 */
	public Post[] getList() {
		target = client.target("https://jsonplaceholder.typicode.com/posts");
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		Post[] posts = null;
		JsonNode rootNode;
		try {
			rootNode = mapper.readTree(value);
			posts = mapper.readValue(rootNode.toString(), Post[].class);
		} catch (IOException ex) {
			System.err.println(ex.getLocalizedMessage());
		} finally {
			response.close();
		}
		return posts;
	}
	
	/**
	 * GET all post from web service provided
	 * 
	 * @return Post[]
	 */
	public Post[] getPost(String param) {
		target = client.target("https://jsonplaceholder.typicode.com/?posts=" + param);
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		Post[] posts = null;
		JsonNode rootNode;
		try {
			rootNode = mapper.readTree(value);
			posts = mapper.readValue(rootNode.toString(), Post[].class);
		} catch (IOException ex) {
			System.err.println(ex.getLocalizedMessage());
		} finally {
			response.close();
		}
		return posts;
	}
}
