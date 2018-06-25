package com.inc.day.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inc.day.domain.Diary;
import com.inc.day.domain.Tag;
import com.inc.day.repository.DiaryDao;
import com.inc.day.repository.TagDao;

@Service
public class DaiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryDao diaryDao;
	
	@Autowired
	private TagDao tagDao;
	
	@Override
	public List<Diary> list() {
		return diaryDao.list();
	}

	@Override
	@Transactional
	public void add(@Valid Diary diary) {
		diaryDao.add(diary);
		int d_id = diary.getId();
		for(Tag tag : diary.getTags()) {
			tag.setD_id(d_id);
			tagDao.add(tag);
		}
	}

	@Override
	public List<Diary> list(String id) {
		return diaryDao.list(id);
	}

}
