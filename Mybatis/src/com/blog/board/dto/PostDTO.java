package com.blog.board.dto;

import java.sql.Date;

public class PostDTO {

	private int id;
	private int bNumber;
	private String pTitle;
	private String pDetail;
	private int cNumber;
	private Date pTime;
	private String pSituation;
	
	
	public PostDTO() {
	
	}


	public PostDTO(int id, int bNumber, String pTitle, String pDetail, int cNumber, Date pTime, String pSituation) {
	
		this.id = id;
		this.bNumber = bNumber;
		this.pTitle = pTitle;
		this.pDetail = pDetail;
		this.cNumber = cNumber;
		this.pTime = pTime;
		this.pSituation = pSituation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getbNumber() {
		return bNumber;
	}


	public void setbNumber(int bNumber) {
		this.bNumber = bNumber;
	}


	public String getpTitle() {
		return pTitle;
	}


	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}


	public String getpDetail() {
		return pDetail;
	}


	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}


	public int getcNumber() {
		return cNumber;
	}


	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}


	public Date getpTime() {
		return pTime;
	}


	public void setpTime(Date pTime) {
		this.pTime = pTime;
	}


	public String getpSituation() {
		return pSituation;
	}


	public void setpSituation(String pSituation) {
		this.pSituation = pSituation;
	}


	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", bNumber=" + bNumber + ", pTitle=" + pTitle + ", pDetail=" + pDetail
				+ ", cNumber=" + cNumber + ", pTime=" + pTime + ", pSituation=" + pSituation + "]";
	}


}
