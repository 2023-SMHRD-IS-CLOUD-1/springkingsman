package com.kingsman.myapp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.kingsman.myapp.model.PrText;
import com.kingsman.myapp.model.Product;
import com.kingsman.myapp.model.TowelAnalysis;
import com.kingsman.myapp.model.Schedule;
import com.kingsman.myapp.model.User;

@Mapper
public interface MemberMapper {

	public void MemberJoin(User mem);

	public List<Product> ProductList();

	public List<User> UserList();

	public List<User> searchUsers(Map<String, String> searchParams);

	public void UserSignUp(User signUpUser);

	public List<TowelAnalysis> dashboard();


   public void PrText(PrText payload2);
   
	public List<User> dashboard2();

	public User LoginCheck(User loginUserIdPw);

	public void ScheduleManage(Schedule scheduleInformation);

	public List<Schedule> ScheduleList();
	
	public void Usermodify(User data);

	
	public void userDelete(String deleteId);

	public void userModify(Map<String, String> modifyData);

	public List<PrText> PTData();
	
	public List<User> NotiList();

	public void Upnoti(User data);

	public void Resetnoti(User data2);

	public List<TowelAnalysis> Notiresult();

	public List<TowelAnalysis> Notiresultfinal();

	public void CountTowel(TowelAnalysis payload2);
}