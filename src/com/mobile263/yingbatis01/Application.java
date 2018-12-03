package com.mobile263.yingbatis01;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ≤‚ ‘mybatisµƒ¡¨Ω”
 * */
public class Application {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); 
		SqlSession session = sqlSessionFactory.openSession();
		System.out.println("session:" + session);
		System.out.println("connect:" + session.getConnection());
		
	}
}
