package com.kingsman.myapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.User;

@Service
public class UserModifyProfileService {

	@Autowired
	private MemberMapper memberMapper;

	public void Usermodify(User data) {
	    memberMapper.Usermodify(data);
	}
	
}
