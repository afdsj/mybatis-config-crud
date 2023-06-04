package com.blog.board.mapper;

import java.util.List;

import com.blog.board.dto.PostDTO;

public interface BlogMapper {// dao == sql(쿼리)
	
	List<PostDTO> postList();

	int insertPost(PostDTO post);

	int updatePost(PostDTO post);

	int deletePost(int pNumber);
	
	
}
