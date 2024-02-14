package com.kingsman.myapp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.kingsman.myapp.model.Product;
import com.kingsman.myapp.model.Schedule;
import com.kingsman.myapp.model.User;

@Mapper
public interface MemberMapper {

	public void MemberJoin(User mem);

	public List<Product> ProductList();

	public List<User> UserList();

	public List<User> searchUsers(Map<String, String> searchParams);

	public void UserSignUp(User signUpUser);

	public User LoginCheck(User loginUserIdPw);

	public void ScheduleManage(Schedule scheduleInformation);
}