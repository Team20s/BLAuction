package com.bla.frame;

import java.util.ArrayList;

import com.bla.vo.MemberVO;

public interface Biz<T,V> {
	public void register(T t) throws Exception;
	public void modify(T t) throws Exception;
	public void remove(V v) throws Exception;
	public T get(V v) throws Exception;
	public ArrayList<T> get() throws Exception;
}