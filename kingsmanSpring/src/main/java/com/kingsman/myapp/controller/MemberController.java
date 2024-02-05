package com.kingsman.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kingsman.myapp.service.MemberService;

import jakarta.annotation.Resource;

@Controller
public class MemberController {

//	@Resource
//	private MemberService memberService;
//	
	@RequestMapping("/")
	public String join() {
		return "MemberJoin";
	}
	
	
}
