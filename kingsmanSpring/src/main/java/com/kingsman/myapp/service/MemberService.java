package com.kingsman.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.Member;
import com.kingsman.myapp.model.Product;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public void MemberJoin(Member mem) {
		memberMapper.MemberJoin(mem);
	}
	public List<Product> ProductList() {
		List<Product> res = memberMapper.ProductList();
		return res;
	}

}
