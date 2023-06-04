package com.blog.board.controller;

import java.util.List;
import java.util.Map;

import com.blog.board.dto.PostDTO;
import com.blog.board.service.BlogService;

public class BlogController {

	private final BlogService blogService;
	
	public BlogController() {
		this.blogService = new BlogService();
	}
	
	public void findAllBlog() {
		List<PostDTO> postList = blogService.findAllBlog();
		
		for (PostDTO postDTO : postList) {
			System.out.println(postDTO);
		}
	}

	public void writeBlogPost(Map<String, String> inputPostCode) {
	
		int bNumber = Integer.parseInt(inputPostCode.get("bNum"));
		String pTitle = inputPostCode.get("pTitle");
		String pDetail = inputPostCode.get("pDetail");
		int cNumber = Integer.parseInt(inputPostCode.get("cNumber"));
		
		PostDTO post = new PostDTO();
		
		post.setbNumber(bNumber);
		post.setpTitle(pTitle);
		post.setpDetail(pDetail);
		post.setcNumber(cNumber);
		
		if (blogService.writeBlogPost(post)) {
			System.out.println("성공");
		}else {
			System.out.println("실패!");
		}
	}

	public void editBlogPost(Map<String, String> inputModifyPost) {
		
		int pNumber = Integer.parseInt(inputModifyPost.get("pNumber"));
		String pDetail = inputModifyPost.get("pDetail");
		
		PostDTO post = new PostDTO();
		
		post.setId(pNumber);
		post.setpDetail(pDetail);
		
		if(blogService.editBlogPost(post)) {
			System.out.println("성공");
		}else {
			System.out.println("실패!");
		}
	}

	public void deleteBlogPost(int removePost) {
		
		int pNumber = removePost;
		
		if(blogService.deleteBlogPost(pNumber)) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}

}
