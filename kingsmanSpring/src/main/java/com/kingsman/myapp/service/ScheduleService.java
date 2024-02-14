package com.kingsman.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.Schedule;

@Service
public class ScheduleService {
	
	@Autowired
	private MemberMapper memberMapper;

	public void scheduleManage(Schedule scheduleInformation) {
		memberMapper.ScheduleManage(scheduleInformation);
	}
	
	

}
