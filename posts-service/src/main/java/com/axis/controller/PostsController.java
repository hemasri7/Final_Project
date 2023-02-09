package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.axis.model.Posts;
import com.axis.service.PostsService;
@RestController
@RequestMapping("/api/v1")
public class PostsController {
	@Autowired
	private PostsService postsService;
	
	@PostMapping("/add")
	public ResponseEntity<Posts> add(@RequestBody Posts posts){
		return new ResponseEntity<Posts>(postsService.add(posts),HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Posts>> getAll(){
		return new ResponseEntity<List<Posts>>(postsService.getAll(),HttpStatus.OK);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Posts> getByPostId(@PathVariable("id") String id){
		Posts p1=postsService.getByPostId(id);
		return new ResponseEntity<Posts>(p1,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Posts> update(@PathVariable("id") String id,@RequestBody Posts posts){
		Posts p2=postsService.update(id, posts);
		return new ResponseEntity<Posts>(p2,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id){
		String st=postsService.delete(id);
		return new ResponseEntity<String>(st,HttpStatus.OK);
	}

}
