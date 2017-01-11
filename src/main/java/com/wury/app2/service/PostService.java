package com.wury.app2.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.wury.app2.model.Post;
import com.wury.app2.util.Constant;

public class PostService{
	
	public List<Post> getAll(){
		
		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL+"/posts");
		ObjectMapper mapper = new ObjectMapper();
		List<Post> list = null;
		try {
			list = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<List<Post>>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Post> getPostsByUser(Integer userId){
		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL+"/posts?userId="+userId);
		ObjectMapper mapper = new ObjectMapper();
		List<Post> list = null;
		try {
			list = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<List<Post>>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Post getPost(Integer id){
		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL+"/posts/"+id);
		ObjectMapper mapper = new ObjectMapper();
		Post post = null;
		try {
			post = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<Post>() {
			});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (ClientHandlerException e) {
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return post;
	}

}
