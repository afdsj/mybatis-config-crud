package com.blog.board;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.blog.board.controller.BlogController;

public class Application01 {

	public static void main(String[] args) {
//		1. 글 목록 조회 (전체)
//		1. 게시글 작성
//		1. 게시글 수정
//		1. 게시글 삭제
//		1. 게시글 조회 

		Scanner sc = new Scanner(System.in);
		boolean runing = true;
		int type = 0;

		BlogController controller = new BlogController();

		/* 프로그램을 반복함 종료는 언제함? 프로그램 종료를 원할때 */
		while (runing) { // 사용자가 종료를 원하면 false를 입력함

			System.out.println("1 : 글 목록 조회");
			System.out.println("2 : 게시글 작성");
			System.out.println("3 : 게시글 수정");
			System.out.println("4 : 게시글 삭제");
			System.out.println("5 : 종료");
			type = sc.nextInt();

			if (type == 1) {
				System.out.println("글 목록 조회");
				controller.findAllBlog();

			} else if (type == 2) {
				System.out.println("게시글 작성");
				controller.writeBlogPost(inputPostCode());

			} else if (type == 3) {
				System.out.println("게시글 수정");
				controller.editBlogPost(inputModifyPost());

			} else if (type == 4) {
				System.out.println("게시글 삭제");
				controller.deleteBlogPost(removePost());

			} else if (type == 5) {
				System.out.println("종료");
				runing = false;

			}

		}

	}

	private static Map<String, String> inputPostCode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("블로그 번호 선택해줘");
		String bNumber = sc.nextLine();
		
		System.out.println("블로그 제목 작성해줘");
		String pTitle = sc.nextLine();
		
		System.out.println("블로그 내용 작성해줘");
		String pDetail = sc.nextLine();
		
		System.out.println("카테고리 번호 선택해줘");
		String cNumber = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("bNum", bNumber);
		parameter.put("pTitle", pTitle);
		parameter.put("pDetail", pDetail);
		parameter.put("cNumber", cNumber);
		
		return parameter;
	}
	
	private static Map<String, String> inputModifyPost(){
		Scanner sc = new Scanner (System.in);
		System.out.println("포스팅 번호 선택해");
		
		String pNumber = sc.nextLine();
		System.out.println("블로그 내용 수정해");
		String pDetail = sc.nextLine();
		
		Map<String, String> parameter = new HashMap<>();
		parameter.put("pNumber", pNumber);
		parameter.put("pDetail", pDetail);
		
		return parameter;
	}

	private static int removePost(){
		Scanner sc = new Scanner (System.in);
		System.out.println("포스팅 번호 선택해");
		
		int pNumber = sc.nextInt();
		
		return pNumber;

	}

}
