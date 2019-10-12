package com.luban.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	IndexService indexService;

	public void setIndexService(IndexService indexService) {
		this.indexService = indexService;
		System.out.println("注入了");
	}
}
