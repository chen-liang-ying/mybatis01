package com.mobile263.yingbatis01.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int userId; 
	private String userName; 
	private String pwd; 
	private int age;
	private String sex; 
	private Date birthday;
	
	public User(String userName, String pwd, int age, String sex, Date birthday) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
	}
}
