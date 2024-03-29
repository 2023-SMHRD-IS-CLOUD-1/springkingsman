package com.kingsman.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.PrText;
import com.kingsman.myapp.model.TowelAnalysis;
import com.kingsman.myapp.service.CountTowelService;

import jakarta.annotation.Resource;

@Controller
public class CountTowelController {
	@Autowired
	private MemberMapper membermapper;
	
	@Resource
	private CountTowelService counttowelservice;
	
	
	 @ResponseBody
	   @PostMapping("/CountTowel")
	   @CrossOrigin(origins = "http://localhost:3000")
	   public void CountTowel(@RequestBody TowelAnalysis payload2) {
	      System.out.println("데이터 잘 들어옴 ? " + payload2.toString());
	      counttowelservice.CountTowel(payload2);
	   }
	
}
