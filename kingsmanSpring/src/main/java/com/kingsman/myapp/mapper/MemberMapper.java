package com.kingsman.myapp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.kingsman.myapp.model.Member;
import com.kingsman.myapp.model.Product;
import com.kingsman.myapp.model.User;

@Mapper
public interface MemberMapper {

	public void MemberJoin(Member mem);

	public List<Product> ProductList();

	public List<User> UserList();


	
	public List<User> searchUsers(Map<String, String> searchParams);

	public void UserSignUp(User signUpUser);

	public static void LoginCheck(User loginUserIdPw) {
		
	}
}