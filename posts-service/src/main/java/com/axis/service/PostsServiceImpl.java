package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.Posts;
import com.axis.repository.PostsRepository;
@Service
public class PostsServiceImpl implements PostsService{
	@Autowired
	private PostsRepository postsRepository;
	
	@Override
	public Posts add(Posts posts) {
		Posts p1=postsRepository.save(posts);
		return p1;
	}

	@Override
	public List<Posts> getAll() {
		List<Posts> p2=postsRepository.findAll();
		return p2;
	}

	@Override
	public Posts getByPostId(String id) {
		Posts p3=postsRepository.findById(id).orElseThrow();
		return p3;
	}

	@Override
	public Posts update(String id, Posts posts) {
		Posts p4=postsRepository.findById(id).orElseThrow();
		p4.setDesc(posts.getDesc());
		p4.setImg(posts.getImg());
		p4.setLikes(posts.getLikes());
		postsRepository.save(p4);
		return p4;
	}

	@Override
	public String delete(String id) {
		Posts p5=postsRepository.findById(id).orElseThrow();
		if(p5!=null) {
			postsRepository.delete(p5);
			return "Deleted Successfully!";
		}
		else {
			return "No records available";
		}
	}

}
