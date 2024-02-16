package com.kingsman.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.User;
import com.kingsman.myapp.service.UserModifyProfileService;

import jakarta.annotation.Resource;

@Controller
public class UserModifyProfileController {
	@Autowired
	   private MemberMapper memberMapper;
	@Resource
	private UserModifyProfileService usermodifyprofileservice;
	
	@ResponseBody
	@PostMapping("/UserModifyProfile")
	@CrossOrigin(origins = "http://localhost:3000")
	public void Usermodify(@RequestBody User data) {
	    System.out.println("정보수정수정수정" + data.toString());
	    usermodifyprofileservice.Usermodify(data);
	}
	
	   }
	
	
	
	
	
	

