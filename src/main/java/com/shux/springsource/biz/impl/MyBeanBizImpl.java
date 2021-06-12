package com.shux.springsource.biz.impl;

import com.shux.springsource.biz.IMyBeanBiz;

public class MyBeanBizImpl implements IMyBeanBiz {

	@Override
	public void printName(String name) {
		System.out.println(name);
		
	}
}
