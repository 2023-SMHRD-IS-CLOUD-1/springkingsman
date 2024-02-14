package com.kingsman.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.PrText;
import com.kingsman.myapp.model.Product;
import com.kingsman.myapp.model.TowelAnalysis;
import com.kingsman.myapp.model.Schedule;
import com.kingsman.myapp.model.User;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public void MemberJoin(User mem) {
		memberMapper.MemberJoin(mem);
	}

	public List<Product> ProductList() {
		List<Product> res = memberMapper.ProductList();
		return res;
	}
	public List<User> UserList() {
		List<User> res = memberMapper.UserList();
		return res;
	}

	public void UserSignUp(User signUpUser) {
		memberMapper.UserSignUp(signUpUser);
	}
	//한명훈
	public List<TowelAnalysis> dashboard() {
		return memberMapper.dashboard();
		
	}
	//한명훈
	public List<User> dashboard2() {
		return memberMapper.dashboard2();
	}
	
	public User LoginCheck(User loginUserIdPw) {
		User user = memberMapper.LoginCheck(loginUserIdPw);
		return user;
	}

	public void PrText(PrText payload2) {
		memberMapper.PrText(payload2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
