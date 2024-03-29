package com.kingsman.myapp.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	
	private String B_ID;
	private String B_PW;
	private String B_NAME;
	private String B_DEPS;
	private String B_POSITION;
	private String B_EMPNO;
	private String B_PHONE;
	private Date B_DATE;
	private int B_ROLE;
	private int B_NOTIFICATION;

	private User user;
	
	
	 public User getUser() {
	        return user;
	    }

	    // 추가된 user 프로퍼티의 setter 메서드
	    public void setUser(User user) {
	        this.user = user;
	    }

	
	
	
	
	
	
}
