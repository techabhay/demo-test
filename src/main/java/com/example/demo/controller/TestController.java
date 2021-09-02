package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	DemoService demoService;

	@GetMapping(path = "/profileMsg")  
	public String getProfileMsg(HttpSession session, HttpServletRequest request) {
		System.out.println("CurrentUrl : " + request.getRequestURL());
		return demoService.getProfileMessage();
	}
}
