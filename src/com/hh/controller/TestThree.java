package com.hh.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;


public class TestThree extends JUnitActionBase {

	@Test
	public void test() throws Exception{
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();
		request.setRequestURI("/oginController/login.do");  
        
        request.addParameter("P_RQ", "2011-11-29");  
          
        request.setMethod("GET");  
          
        // 执行URI对应的action    
        this.excuteAction(request, response);  
        String result = response.getContentAsString();  
        Assert.assertNotNull(result);  
	}
}
