package com.bla.vo;

import java.util.Date;

public class BiddingVO {

	private int bid_id;
	private int member_id;
	private int auct_id;
	private long price;
	private Date time;
	private String bidder_account;
	
	public BiddingVO(int bid_id, int member_id, int auct_id, long price, Date time, String bidder_account) {
		super();
		this.bid_id = bid_id;
		this.member_id = member_id;
		this.auct_id = auct_id;
		this.price = price;
		this.time = time;
		this.bidder_account = bidder_account;
	}
	
	public BiddingVO()
	{
		
	}
	public int getBid_id() {
		return bid_id;
	}
	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getAuct_id() {
		return auct_id;
	}
	public void setAuct_id(int auct_id) {
		this.auct_id = auct_id;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getBidder_account() {
		return bidder_account;
	}
	public void setBidder_account(String bidder_account) {
		this.bidder_account = bidder_account;
	}
	@Override
	public String toString() {
		return "BiddingVO [bid_id=" + bid_id + ", member_id=" + member_id + ", auct_id=" + auct_id + ", price=" + price
				+ ", time=" + time + ", bidder_account=" + bidder_account + "]";
	}
	
	
}
