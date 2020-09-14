package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long imageId;

	private String imageName;
	private String imageUrl;
	private boolean isActive;
	public ImageEntity() {
	}
	public ImageEntity(Long imageId, String imageName, String imageUrl, boolean isActive) {
		this.imageId = imageId;
		this.imageName = imageName;
		this.imageUrl = imageUrl;
		this.isActive = isActive;
	}
	public Long getImageId() {
		return imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "ImageEntity [imageId=" + imageId + ", imageName=" + imageName + ", imageUrl=" + imageUrl + ", isActive="
				+ isActive + "]";
	}
	
	

}
