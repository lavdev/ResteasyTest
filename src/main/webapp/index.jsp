<%-- 
    Document   : index.jsp
    Created on : Apr 29, 2018, 8:49:41 AM
    Author     : Laverson Espíndola
--%>
<%@page import="br.com.lav.test.model.PostDao"%>
<%@page import="java.util.List"%>
<%@page import="br.com.lav.test.model.Post"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
		  <meta charset="utf-8">
		  <meta name="viewport" content="width=device-width, initial-scale=1">
		  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
     	<div class="container">
        <table class="table">
           	 <thead>	
           	 	<tr>           	 	
	                <Th>##</Th>
	                <Th>User</Th>
	                <Th>Title</Th>
	                <Th>Body</Th>
                </tr>
              </thead>
            <%
             PostDao dao = new PostDao();
             Post[] posts = dao.getPostList();
             for (Post post : posts) {
             %>
             <!-- HTML Begin -->
              <tbody>
	               <tr>
	                    <td><%=post.getId()%></td>
	                    <td><%=post.getUserId()%></td>
	                    <td><%=post.getTitle()%></td>
	                    <td><%=post.getBody()%></td>
	                </tr>
                </tbody>
                <!-- HTML End-->
             <%
                }
              %>
        </table>
        </div>
    </body>    
</html>
