package com.wury.app2;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import com.wury.app2.model.Post;
import com.wury.app2.service.PostService;

public class MyViewModel {

	private List<Post> postList;
	private PostService postService;
	private Integer userId;

	@Init
	public void init() {
		postService = new PostService();
		postList = postService.getAll();
	}

	@Command
	@NotifyChange("postList")
	public void searchByUserId(){
		postList = postService.getPostsByUser(userId);
	}

	public List<Post> getPostList(){
		return postList;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	public Integer getUserId(){
		return userId;
	}
	
}
