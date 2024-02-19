package com.kingsman.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.TowelAnalysis;
import com.kingsman.myapp.model.User;
import com.kingsman.myapp.service.NotificationService;

import jakarta.annotation.Resource;

@Controller
public class NotificationController {
	@Autowired
	private MemberMapper memberMapper;
	@Resource
	private NotificationService notificationService;

	@RequestMapping("/Notilist")
	@ResponseBody
	public List<User> Notilist() {
		List<User> list = notificationService.NotiList();
		System.out.println("Noti확인확인" + list);

		return list;
	}

	@ResponseBody
	@PostMapping("/Upnoti")
	@CrossOrigin(origins = "http://localhost:3000")
	public void Upnoti(@RequestBody User data) {
		System.out.println("upnotiupnoti" + data.toString());
		notificationService.Upnoti(data);
	}

	@ResponseBody
	@PostMapping("/Resetnoti")
	@CrossOrigin(origins = "http://localhost:3000")
	public void Resetnoti(@RequestBody User data2) {
		System.out.println("ResetReset" + data2.toString());
		notificationService.Resetnoti(data2);
	}

	@RequestMapping("/Notiresultfinal")
	@ResponseBody
	public List<TowelAnalysis> Notiresult() {
		List<TowelAnalysis> list = notificationService.Notiresult();
		System.out.println("NotiresultNotiresult" + list);

		return list;
	}

}
