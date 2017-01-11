package com.wury.app2.service;

import com.wury.app2.model.Post;
import com.wury.app2.model.User;

public class Test {

	public static void main(String[] args){
		PostService ps = new PostService();
		for(Post p:ps.getPostsByUser(1)){
			System.out.println(p);
		}
		
	}

}
