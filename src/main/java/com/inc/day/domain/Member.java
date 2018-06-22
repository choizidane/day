package com.inc.day.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Member {
	@Pattern(regexp="[A-Za-z0-9]{4,10}",message="알파벳대소문자와숫자4-10글자")
	private String id;
	@Pattern(regexp="[A-Za-z0-9]{6,10}",message="알파벳대소문자와숫자6-10글자")
	private String password;
	private String passwordConfirm;
	@Pattern(regexp="[가-힣]{4,10}",message="한글4-10글자")
	private String name;
	@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]{2,10}",message="잘못된 이메일형식입니다 ex)shit.gmail.com")
	private String email;
	private String emailCode;
	@NotEmpty(message="성별을 선택해주세요.")
	@Pattern(regexp="[fm]",message="잘못된선택")
	private String gender;
	
	public String getEmailCode() {
		return emailCode;
	}
	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isPasswordValid() {
		return this.password.equals(this.passwordConfirm);
	}
	
	
}
