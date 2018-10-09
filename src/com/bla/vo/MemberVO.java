package com.bla.vo;

import java.util.Date;

public class MemberVO {
	private int member_id;
	private String email;
	private String pw;
	private String name;
	private String address;
	private String phone;
	private Date birth;
	private int score;
	private int likes;
	private String member_account;
	
	public MemberVO() {
		super();
	}

	public MemberVO(int member_id, String email, String pw, String name, String address, String phone, Date birth, int score,
			int likes, String member_account) {
		super();
		this.member_id = member_id;
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.birth = birth;
		this.score = score;
		this.likes = likes;
		this.member_account = member_account;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getMember_account() {
		return member_account;
	}

	public void setMember_account(String member_account) {
		this.member_account = member_account;
	}

	//pw 추가 되어야 함!  추가 부탁드려요~~~
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + likes;
		result = prime * result + ((member_account == null) ? 0 : member_account.hashCode());
		result = prime * result + member_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (likes != other.likes)
			return false;
		if (member_account == null) {
			if (other.member_account != null)
				return false;
		} else if (!member_account.equals(other.member_account))
			return false;
		if (member_id != other.member_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", email=" + email + ", pw=" + pw + ", name=" + name + ", address="
				+ address + ", phone=" + phone + ", birth=" + birth + ", score=" + score + ", likes=" + likes
				+ ", member_account=" + member_account + ", getMember_id()=" + getMember_id() + ", getPw()=" + getPw()
				+ ", getEmail()=" + getEmail() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getPhone()=" + getPhone() + ", getBirth()=" + getBirth() + ", getScore()=" + getScore()
				+ ", getLikes()=" + getLikes() + ", getMember_account()=" + getMember_account() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
	

	
		
}
