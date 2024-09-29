package com.demo.rest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class DemoService {
	@RequestMapping("/")
	public void hello() {
		
	}
}
