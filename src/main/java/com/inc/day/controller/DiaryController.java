package com.inc.day.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.inc.day.domain.Diary;
import com.inc.day.domain.Member;
import com.inc.day.service.DiaryService;

@Controller
public class DiaryController {
	
	@Autowired
	private DiaryService diaryService;
	
	@GetMapping("/")
	public String main(Model model, HttpSession session) {
		Member member = (Member)session.getAttribute("member");
		model.addAttribute("diaryList", diaryService.list(member.getId()));
		return "main";
	}
	
	@GetMapping("/diary/add")
	public String add(Model model) {
		model.addAttribute("diary", new Diary());
		return "diary/add";
	}
	
	@PostMapping("/diary/add")
	public String add(@ModelAttribute @Valid Diary diary, BindingResult result, Model model, HttpSession session) {
		System.out.println(diary.getTags().size());
		if(result.hasErrors()) {
			return "diary/add";
		}
		Member member = (Member)session.getAttribute("member");
		diary.setU_id(member.getId());
		diaryService.add(diary);
		return "redirect:/";
	}
}
