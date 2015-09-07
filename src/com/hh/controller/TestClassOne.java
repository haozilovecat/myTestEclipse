package com.hh.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
/**
 * 通过注解 直接使用controller中的方法
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:spring-application.xml"})
public class TestClassOne {
	 private MockHttpServletRequest request;  
	 private MockHttpServletResponse response;   
	@Before
	public void setUp(){
		request =  new MockHttpServletRequest();
		response = new MockHttpServletResponse();
	}
	
	@Autowired
	private LoginController logging;
	@Test
	public void test() throws Exception{
		request.setParameter("name", "tom");
		System.out.println(logging.tt(request, response));
		
	
	}
	

}
