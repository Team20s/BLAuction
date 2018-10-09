package com.bla.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bla.frame.Dao;
import com.bla.vo.MemberVO;

@Repository("mdao")
public class MemberDao implements Dao<MemberVO,Integer> {

	@Override
	public void insert(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO select(Integer v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberVO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
