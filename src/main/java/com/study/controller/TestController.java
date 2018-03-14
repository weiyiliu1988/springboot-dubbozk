package com.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LIU
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "hello world!";
	}

}
