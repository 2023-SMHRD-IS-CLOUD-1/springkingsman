package com.kingsman.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.PrText;
import com.kingsman.myapp.model.TowelAnalysis;

@Service
public class CountTowelService {
	@Autowired
	private MemberMapper membermapper;

	public void CountTowel(TowelAnalysis payload2) {
		membermapper.CountTowel(payload2);
	}

	
}
