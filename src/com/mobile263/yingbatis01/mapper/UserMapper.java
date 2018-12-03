package com.mobile263.yingbatis01.mapper;

import java.util.List;

import com.mobile263.yingbatis01.pojo.User;

public interface UserMapper {

	public User selectUserById(int userId) throws Exception ;
	public void insertUser(User user) throws Exception;
	public void updateUser(User user) throws Exception;
	public void deleteUser(int userId) throws Exception;
	public List<User> selectAllUser() throws Exception;
}
