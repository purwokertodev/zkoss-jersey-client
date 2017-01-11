package com.wury.app2.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.wury.app2.model.User;
import com.wury.app2.util.Constant;

public class UserService {
	
	public List<User> getAll(){
		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL+"/users");
		ObjectMapper mapper = new ObjectMapper();
		List<User> list = null;
		try {
			list = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<List<User>>() {
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
	
	public User getUser(Integer id){
		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL+"/users/"+id);
		ObjectMapper mapper = new ObjectMapper();
		User user = null;
		try {
			user = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<User>() {
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
		return user;
	}

}
