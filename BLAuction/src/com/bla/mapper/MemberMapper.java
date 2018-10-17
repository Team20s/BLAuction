package com.bla.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bla.vo.MemberVO;

@Repository("mmapper")
public interface MemberMapper {
	public MemberVO select(String member_id);
	public ArrayList<MemberVO> selectAll();
	public void insert(MemberVO obj);
	public void updatePw(MemberVO obj);
	public void updatePhone(MemberVO obj);
	public void updateAddress(MemberVO obj);
	public void updateScore(MemberVO obj);
	public void updateLikes(MemberVO obj);
}
