package com.kingsman.myapp.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kingsman.myapp.model.Member;

@Mapper
public interface MemberMapper {

	public void MemberJoin(Member mem);

}
