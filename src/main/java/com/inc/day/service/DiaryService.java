package com.inc.day.service;

import java.util.List;

import javax.validation.Valid;

import com.inc.day.domain.Diary;

public interface DiaryService {
	public List<Diary> list();

	public void add(@Valid Diary diary);

	public List<Diary> list(String id);
}
