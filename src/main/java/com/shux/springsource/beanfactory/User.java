package com.shux.springsource.beanfactory;
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
public class User {
	private String username;
	private String sex;
	private Integer age;
	private String phone;
	
	public User() {
		System.out.println("调用User构造器!");
	}
	public void printUsername(String username) {
		System.out.println(username);
	}
	
	public void init() {
		System.out.println("初始化方法init()");
	}
	public void destroy() {
		System.out.println("销毁方法destroy()");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("设置属性username");
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		System.out.println("设置属性sex");
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		System.out.println("设置属性age");
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		System.out.println("设置属性phone");
		this.phone = phone;
	}
	
}
