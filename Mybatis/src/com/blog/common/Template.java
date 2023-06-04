package com.blog.common;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.blog.board.mapper.BlogMapper;

public class Template {

	private static SqlSessionFactory sessionFactory;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "C##Blog";
	private static final String PASSWORD = "Blog";
	
	public static SqlSession getSession() {
		
		if(sessionFactory == null) {
			Environment enviroment = new Environment("dev",
					new JdbcTransactionFactory(),
					new PooledDataSource(DRIVER, URL, USER, PASSWORD));
			Configuration configuration = new Configuration(enviroment);
			configuration.addMapper(BlogMapper.class); //인터페이스 
			
			sessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		}
		return sessionFactory.openSession(false);
		
	}
	
}
