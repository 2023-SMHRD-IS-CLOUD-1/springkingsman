package com.kingsman.myapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.PrText;
import com.kingsman.myapp.model.Product;
import com.kingsman.myapp.model.User;
import com.kingsman.myapp.service.MemberService;
import com.smhrd.myapp.model.Member;

import jakarta.annotation.Resource;

@Controller
public class MemberController {
	
	@Autowired
    private MemberMapper memberMapper;

	
	@Resource
	private MemberService memberService;
//	
	@RequestMapping("/")
	public String join() {
		return "MemberJoin";
	}
	
	@ResponseBody
	@PostMapping("/MemberPromotional")
	@CrossOrigin(origins="http://localhost:3000")
	public PrText getYourPayloadClass(@RequestBody PrText payload2) {
	    System.out.println("데이터 잘 들어옴 ? " + payload2.toString());
	    return payload2;
	}
	
	@ResponseBody
	@PostMapping("/UserManagement")
	@CrossOrigin(origins="http://localhost:3000")
	 public List<User> searchUsers(String name, String position) {
        Map<String, String> searchParams = new HashMap<>();
        searchParams.put("name", name);
        searchParams.put("position", position);
        return memberMapper.searchUsers(searchParams); 
    }
 
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/ProductList")
	@ResponseBody
	public List<Product> ProductList() {
		List<Product> list = memberService.ProductList();
		System.out.println("List확인여"+list);
	
		return list; 
	}
	@ResponseBody
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:3000")
	public User loginSuccessFail(@RequestBody User loginUserIdPw ) {
		System.out.println("로그인??" + loginUserIdPw.toString());
		return loginUserIdPw;
	}
	
	
}
