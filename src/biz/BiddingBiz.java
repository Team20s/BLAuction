package biz;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import frame.Biz;
import vo.BiddingVO;

@Repository("bbiz")
public class BiddingBiz implements Biz<BiddingVO,Integer>{

	@Override
	public void register(BiddingVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(BiddingVO t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BiddingVO get(Integer v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BiddingVO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
