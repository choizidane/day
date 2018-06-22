package com.inc.day.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.day.domain.Member;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;

	public Member findOne(String id) {
		Member member = sqlSession.selectOne("member.findOne",id);
		return member;
	}

	public Member getfindOneByEmail(String email) {
		return sqlSession.selectOne("member.findOneByEmail", email);
	}

	public void signup(Member member) {
		sqlSession.insert("member.signup", member);
	}
}
