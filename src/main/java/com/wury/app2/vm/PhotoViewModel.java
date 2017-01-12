package com.wury.app2.vm;

import java.util.List;

import org.zkoss.bind.annotation.Init;

import com.wury.app2.model.Photo;
import com.wury.app2.service.PhotoService;

public class PhotoViewModel {
	
	private List<Photo> listPhoto;
	private Photo selectedPhoto;
	private Integer photoId;
	
	private PhotoService photoService;
	
	@Init
	public void init(){
		photoService = new PhotoService();
		listPhoto = photoService.getAll();
	}

	public List<Photo> getListPhoto() {
		return listPhoto;
	}

	public void setListPhoto(List<Photo> listPhoto) {
		this.listPhoto = listPhoto;
	}

	public Photo getSelectedPhoto() {
		return selectedPhoto;
	}

	public void setSelectedPhoto(Photo selectedPhoto) {
		this.selectedPhoto = selectedPhoto;
	}

	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}
	

}
