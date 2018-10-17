package com.bla.biz;

import java.util.ArrayList;

import javax.annotation.Resource;


import com.bla.dao.MemberDao;
import com.bla.frame.Biz;
import com.bla.vo.MemberVO;

@org.springframework.stereotype.Service("mbiz")
public class MemberBiz implements Biz<MemberVO,String> {

	@Resource(name = "mdao")
	MemberDao dao;

	@Override
	public void register(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(t);
	}

	@Override
	public void modify(MemberVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO get(String v) throws Exception {
		// TODO Auto-generated method stub
		return dao.select(v);
	}

	@Override
	public ArrayList<MemberVO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
