package com.inc.day.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inc.day.service.DiaryService;

@Controller
public class DairyController {
	
	@Autowired
	private DiaryService diaryService;
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("diaryList", diaryService.list());
		return "main";
	}
}
