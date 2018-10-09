package com.bla.biz;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bla.frame.Biz;
import com.bla.vo.MemberVO;

@Repository("mbiz")
public class MemberBiz implements Biz<MemberVO,Integer> {

	@Override
	public void register(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO get(Integer v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberVO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
