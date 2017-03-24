package com.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.BookMapper;
import com.entity.Book;
public class BookMapperTest {
	@SuppressWarnings("resource")
	@Test
	public void testGetBook(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//1. 获取mapper接口的代理对象
		BookMapper bookMapper = context.getBean(BookMapper.class);
		//查询参数
		Book param = new Book();
		param.setBname("   ");
//		param.setAuthor("%贾%");
		param.setPress("%清华%");
		//count查询
		int count = bookMapper.countByParam(param);
		System.out.println("总条数:"+count);
	}
}
