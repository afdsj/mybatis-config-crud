package com.blog.board.service;

import org.apache.ibatis.session.SqlSession;

import com.blog.board.dto.PostDTO;
import com.blog.board.mapper.BlogMapper;
import com.blog.common.Template;
import static com.blog.common.Template.getSession;

import java.util.List;

public class BlogService {

	public List<PostDTO> findAllBlog() {
		// 도메인 로직 , sqlSession 연결
		SqlSession sqlSession = getSession();
		
		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
		List<PostDTO> postList = blogMapper.postList();
		
		sqlSession.close();
		
		return postList;
	}
	
	public boolean writeBlogPost(PostDTO post) {
		SqlSession sqlSession = getSession();
		
		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
		
		int result = blogMapper.insertPost(post);
		
		if(result>0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
	
	}

	public boolean editBlogPost(PostDTO post) {
		SqlSession sqlSession = getSession();
		
		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
		
		int result = blogMapper.updatePost(post);
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		
		sqlSession.close();

		return result > 0 ? true : false;
	}

	public boolean deleteBlogPost(int pNumber) {
		SqlSession sqlSession = getSession();
		
		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
		
		int result = blogMapper.deletePost(pNumber);
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		
		sqlSession.close();

		return result > 0 ? true : false;
	}


	
}
