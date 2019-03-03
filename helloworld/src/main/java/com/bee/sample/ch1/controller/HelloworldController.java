package com.bee.sample.ch1.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bee.sample.ch1.annotation.Function;

@Controller
public class HelloworldController {

	/**
	 * 访问:http://127.0.0.1:18080/sayhello.html?name=springboot
	 * @author xiandafu
	 *
	 */
	@RequestMapping("/sayhello.html")
	@Function()
	public @ResponseBody String say(String name){
		String currentDTStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		return "99999----hello "+ currentDTStr+"\t \n\n SSSSSSS \n name = " +name;
	}
	/**
	 * 访问:http://127.0.0.1:18080/testddd?name=springboot
	 * @author xiandafu
	 *
	 */
	@RequestMapping("/testddd")
	public @ResponseBody String testddd(String name){
		String currentDTStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		return "testddd "+ currentDTStr+"\t \n\n SSSSSSS \n name = " +name;
	}
}
