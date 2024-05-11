package com.example.app.controller;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@WebAppConfiguration
@Slf4j
public class controllerTests {

	@Autowired
	private SimpleController simpleController;
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void isNotNullTests() {
//		System.out.println(simpleController);
		log.info(simpleController.toString());
		log.info(mockMvc.toString());
		assertNotNull(simpleController);
		assertNotNull(mockMvc);
	}
	
	@Test
	public void simpleControllerTests() throws Exception {
		//GET /simple/t1
//		mockMvc .perform(get("/simple/t1"))	//HTTP 메소드를 결정
//			.andExpect(status().isOk())	// 응답을 검증하는 역할, 상태코드값을 테스트할 수 있음(예측)
//			.andExpect(view().name("t1")) // view의 name을 예측
//			.andExpect(model().attributeExists("key1"))
//			.andDo(print());	// 요청/응답 전체 메세지를 확인, 이후에 어떤식으로 처리할지 
		
		//POST /simple/t1
//		mockMvc .perform(post("/simple/t1"))	
//			.andExpect(status().isOk())	
//			.andDo(print());	 
		
		//GET /simple/t2
		mockMvc .perform(get("/simple/t2"))	
			.andExpect(status().isOk())	
			.andDo(print());
	
		mockMvc .perform(post("/simple/t2"))	
			.andExpect(status().isOk())	
			.andDo(print());
	
	}

}
