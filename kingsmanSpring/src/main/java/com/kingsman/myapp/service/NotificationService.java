package com.kingsman.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.TowelAnalysis;
import com.kingsman.myapp.model.User;

@Service
public class NotificationService {
	@Autowired
	private MemberMapper memberMapper;

	public List<User> NotiList() {
		List<User> res = memberMapper.NotiList();
		return res;
	}

	public void Upnoti(User data) {
		memberMapper.Upnoti(data);

	}

	public void Resetnoti(User data2) {
		memberMapper.Resetnoti(data2);

	}

	public List<TowelAnalysis> Notiresult() {
		List<TowelAnalysis> res = memberMapper.Notiresult();
		return res;
	}
	public List<TowelAnalysis> Notiresultfinal() {
		List<TowelAnalysis> res = memberMapper.Notiresultfinal();
		return res;
	}



	public List<TowelAnalysis> Notiresultme(TowelAnalysis payload2) {
		List<TowelAnalysis> res = memberMapper.Notiresultme(payload2);
		return res;
	}

}
