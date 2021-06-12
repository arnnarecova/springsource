package com.shux.springsource.beanfactory;

import org.springframework.beans.factory.FactoryBean;

/**
 * 描述：
 * 
 * <pre>HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2017年12月14日      Simba.Hua         Create
 * ****************************************************************************
 * </pre>
 * @author Simba.Hua
 */
public class MyBeanFactory implements FactoryBean<User>{

	@Override
	public User getObject() throws Exception {
		System.out.println("mybeanFactory getObject");
		return new User();
	}

	@Override
	public Class<User> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}}
