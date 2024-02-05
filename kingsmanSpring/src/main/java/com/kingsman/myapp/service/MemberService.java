package com.kingsman.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public void MemberJoin(Member mem) {
		memberMapper.MemberJoin(mem);
	}

}
