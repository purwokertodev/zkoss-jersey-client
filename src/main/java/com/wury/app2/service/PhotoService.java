package com.wury.app2.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.wury.app2.model.Photo;
import com.wury.app2.util.Constant;

public class PhotoService {

	public List<Photo> getAll() {

		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL + "/photos");
		ObjectMapper mapper = new ObjectMapper();
		List<Photo> list = null;
		try {
			list = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<List<Photo>>() {
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
	
	public Photo getPhoto(Integer id){
		ServiceUtil serviceUtil = new ServiceUtil(Constant.BASE_URL + "/photos/"+id);
		ObjectMapper mapper = new ObjectMapper();
		Photo photo = null;
		try {
			photo = mapper.readValue(serviceUtil.get().getEntity(String.class), new TypeReference<List<Photo>>() {
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
		return photo;
	}

}
