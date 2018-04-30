package br.com.lav.test.model;

import br.com.lav.test.Test;

/**
 *
 * @author laverson
 */
public class PostDao {
	
	/***
	 * Get list of post
	 * @return Post[]
	 */
    public Post[] getPostList(){
        return Test.getInstance().getList();
    }
    
    /***
     * Get specific post by user id 
     * @param value
     * @return Post[]
     */
    public Post[] getPost(String value){
        return Test.getInstance().getPostByUser(value);
    }
 }
