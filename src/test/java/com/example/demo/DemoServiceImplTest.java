package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.TestController;
import com.example.demo.service.DemoService;
import com.example.demo.service.impl.DemoServiceImpl;

@SpringBootTest(classes = {DemoServiceImpl.class, TestController.class, DemoTestApplication.class})
public class DemoServiceImplTest {
	
	@Autowired
	DemoService demoService;

	@Test
	public void getProfileMessageTest() {
		String msg = "Hi Default 11";
		assertEquals(msg, demoService.getProfileMessage());
	}
}
