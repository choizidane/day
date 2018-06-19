package com.inc.day.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inc.day.domain.Diary;
import com.inc.day.repository.DiaryDao;

@Service
public class DaiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryDao diaryDao;
	
	@Override
	public List<Diary> list() {
		return diaryDao.list();
	}

	@Override
	public void add(@Valid Diary diary) {
		diaryDao.add(diary);
	}

}
