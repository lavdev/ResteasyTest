/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lav.test.model;

import br.com.lav.test.Test;

/**
 *
 * @author laver
 */
public class PostDao {
    public Post[] getPostList(){
        return Test.getInstance().getList();
    }
    
    public Post[] getPost(String value){
        return Test.getInstance().getPost(value);
    }
 }
