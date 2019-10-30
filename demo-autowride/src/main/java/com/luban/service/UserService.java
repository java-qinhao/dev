package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
public class UserService {
//	@Autowired
//	IndexService indexService;

	UserService(){
		System.out.println("userService init");
	}
}
