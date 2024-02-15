package com.kingsman.myapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kingsman.myapp.mapper.MemberMapper;
import com.kingsman.myapp.model.PrText;
import com.kingsman.myapp.model.Product;
import com.kingsman.myapp.model.TowelAnalysis;
import com.kingsman.myapp.model.User;
import com.kingsman.myapp.service.MemberService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {

   @Autowired
   private MemberMapper memberMapper;


   @Resource
   private MemberService memberService;


   @RequestMapping("/")
   public String join() {
      return "MemberJoin";
   }

   @ResponseBody
   @PostMapping("/MemberPromotional")
   @CrossOrigin(origins = "http://localhost:3000")
   public void PrText(@RequestBody PrText payload2) {
      System.out.println("데이터 잘 들어옴 ? " + payload2.toString());
      memberService.PrText(payload2);
   }

   @ResponseBody
   @PostMapping("/UserManagement")
   @CrossOrigin(origins = "http://localhost:3000")
   public List<User> searchUsers(@RequestBody Map<String, String> searchData) {

      return memberMapper.searchUsers(searchData);
   }

   @RequestMapping("/ProductList")
   @ResponseBody
   public List<Product> ProductList() {
      List<Product> list = memberService.ProductList();
      System.out.println("List확인여" + list);

      return list;
   }

   @ResponseBody
   @RequestMapping("/login")
   @CrossOrigin(origins = "http://localhost:3000")
   public String loginSuccessFail(@RequestBody User loginUserIdPw, HttpServletRequest request) {
      System.out.println("로그인??" + loginUserIdPw);
      // 여기서 로그인 성공하면 값이 row 값이 1로 돌아오고 아니면 0 이니까
      // 1일때 다시 select구문을 실행해서 모든 값을 가져와서 그걸 return 해준다!! 그 로직을 짜야됨 아닐땐 null 값을
      // 리턴해줘야됨?
      User user = memberService.LoginCheck(loginUserIdPw);

      if (user == null) {
         return null;
      }


      System.out.println(user);
      return user.getB_ID();
   }

   @ResponseBody
   @PostMapping("/signUp")
   @CrossOrigin(origins = "http://localhost:3000")
   public void signUpUser(@RequestBody User signUpUser) {
      System.out.println(signUpUser.toString());
      memberService.UserSignUp(signUpUser);
   }
   


	//한명훈
	@ResponseBody
	@PostMapping("/Dashboard")
	@CrossOrigin(origins="http://localhost:3000")
	public List<TowelAnalysis> dashboard() {
		return memberService.dashboard();
	}
	//한명훈
	@ResponseBody
	@PostMapping("/Dashboard2")
	@CrossOrigin(origins="http://localhost:3000")
	public List<User> dashboard2() {
		return memberService.dashboard2();
	}
	
	//한명훈
	@ResponseBody
	@PostMapping("/UserManagement2")
	@CrossOrigin(origins = "http://localhost:3000")
	public void userDelete(@RequestBody String deleteId) {
		deleteId = deleteId.substring(1, deleteId.length() - 1);
		System.out.println(deleteId);
		memberService.userDelete(deleteId);
		
	}
	//한명훈
	@ResponseBody
	@PostMapping("/UserModify")
	@CrossOrigin(origins = "http://localhost:3000")
	public void userModify(@RequestBody Map<String, String> modifyData) {
		memberService.userModify(modifyData);
		
	}
	
}
