<%-- 
    Document   : index
    Created on : Apr 29, 2018, 8:49:41 AM
    Author     : Laverson
--%>

<%@page import="br.com.lav.test.model.PostDao"%>
<%@page import="java.util.List"%>
<%@page import="br.com.lav.test.model.Post"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSONPlaceholder test</title>
    </head>
    <body>
        <table>
            <%
                PostDao dao = new PostDao();
                Post[] posts = dao.getPostList();
                for (Post post : posts) {
                  %>
                  <tr>
                      <td><%=post.getUserId()%></td>
                      <td><%=post.getId()%></td>
                      <td><%=post.getTitle()%></td>
                      <td><%=post.getBody()%></td>
                  </tr>
                  <%
                }
            %>
        </table>
    </body>
</html>
