package com.inc.day.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Diary {
	private int id;
	private String u_id;
	@Size(min=0, max=15, message="15글자이내로 작성해주세요")
	private String title;
	@NotEmpty(message="한글자이상입력해주세요")
	@Size(max=300, message="300글자이내로작성해주세요")
	private String content;
	private String regdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}
