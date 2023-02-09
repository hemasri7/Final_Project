package com.axis.service;

import java.util.List;

import com.axis.model.Posts;

public interface PostsService {
	public Posts add(Posts posts);
	public List<Posts> getAll();
	public Posts getByPostId(String id);
	public Posts update(String id,Posts posts);
	public String delete(String id);

}
