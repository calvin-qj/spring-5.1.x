package org.springframework.myboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/app/test")
	public Object hello(){
		return "hello,spring";
	}
}
