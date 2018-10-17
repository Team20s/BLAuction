package com.bla.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bla.frame.Dao;
import com.bla.mapper.MemberMapper;
import com.bla.vo.MemberVO;

@Repository("mdao")
public class MemberDao implements Dao<MemberVO,String> {

	@Autowired
	MemberMapper mapper;

	@Override
	public void insert(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
		mapper.insert(t);
	}

	@Override
	public void update(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public MemberVO select(String v) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(v);
	}

	@Override
	public ArrayList<MemberVO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
