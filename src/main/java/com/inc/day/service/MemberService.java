package com.inc.day.service;

import com.inc.day.domain.Member;

public interface MemberService {

	Member findOne(String id);

	boolean emailDupCheck(String email);

	String sendCertifyEmail(String email);

	void signup(Member member);

}
