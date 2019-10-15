package com.luban.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	IndexService indexService;

	public void setIndexServiceImpl(IndexService indexService) {
		this.indexService = indexService;
		System.out.println(indexService);
	}
}
