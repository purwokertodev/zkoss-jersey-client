package com.wury.app2.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ServiceUtil {
	
	private String url;
	
	public ServiceUtil(String url){
		this.url = url;
	}
	
	
	public ClientResponse get(){
		Client client = Client.create();
		WebResource service = client.resource(url);
		ClientResponse response = service.accept("Content-type: application/json; charset=utf-8").header("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11")
                .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}
		
		return response;
	}
	

}