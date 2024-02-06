package com.kingsman.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kingsman.myapp.model.Member;
import com.kingsman.myapp.model.Product;

@Mapper
public interface MemberMapper {

	public void MemberJoin(Member mem);

	public List<Product> ProductList();

}
