package com.kingsman.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.Schedule;
import com.kingsman.myapp.service.MemberService;
import com.kingsman.myapp.service.ScheduleService;

import jakarta.annotation.Resource;

@Controller
public class ScheduleController {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Resource
	private MemberService memberService;
	
	@Resource
	private ScheduleService scheduleService;
	
	@ResponseBody
	@RequestMapping("/scheduleManage")
	@CrossOrigin(origins = "http://localhost:3000")
	public void scheduleManage(@RequestBody Schedule scheduleInformation) {
		System.out.println("일정관리" + scheduleInformation);
		scheduleService.scheduleManage(scheduleInformation);
	}
	
	@ResponseBody
	@RequestMapping("/scheduleList")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Schedule> getScheduleList(){
		List<Schedule> scheduleList = scheduleService.ScheduleList();
		System.out.println(scheduleList);
		return scheduleList;
	}

}
