package com.inc.day.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inc.day.domain.Tag;

@Repository
public class TagDao {
	@Autowired
	private SqlSession sqlSession;
	
	public void add(Tag tag) {
		sqlSession.insert("tag.add", tag);
	}
	
}
