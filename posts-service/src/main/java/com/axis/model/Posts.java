package com.axis.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Posts {
	@Id
	private String id;
	private String desc;
	private String img;
	private int likes;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Posts(String id, String desc, String img, int likes) {
		super();
		this.id = id;
		this.desc = desc;
		this.img = img;
		this.likes = likes;
	}
	public Posts() {
		super();
	}
	
	
}
