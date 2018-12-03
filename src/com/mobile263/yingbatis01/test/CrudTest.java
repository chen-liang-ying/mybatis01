package com.mobile263.yingbatis01.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mobile263.yingbatis01.mapper.UserMapper;
import com.mobile263.yingbatis01.pojo.User;

public class CrudTest {

	private UserMapper userMapper;
	private SqlSession  sqlSession;
	
	@Before
	public void setup() throws IOException {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
		
	}
	
	@After
	public void tearDown() {
		sqlSession.commit();
		sqlSession.close();	

	}
	
	@Test
	public void testSelectUserById() throws Exception {
		User user = userMapper.selectUserById(5);
		System.out.println(user.toString());
	}
	
	@Test
	public void testInsertUser() throws Exception {
		User user = new User("Áº³¯Î°","234",23,"ÄÐ",new Date());
		userMapper.insertUser(user);
		System.out.println(user.toString());
	}
	
	@Test
	public void testUpdateUser() throws Exception {
		User user = new User(2,"ÖÜÈó·¢","234",23,"ÄÐ",new Date());
		userMapper.updateUser(user);
		
		System.out.println(user.toString());
		
	}
	
	@Test
	public void testDeleteUser() throws Exception {
		userMapper.deleteUser(7);
		
	}
	
	@Test
	public void testSelectAllUser() throws Exception {
		List<User> users = userMapper.selectAllUser();
		for (User user : users) {
			System.out.println(user.toString());
		}
		
	}
}
