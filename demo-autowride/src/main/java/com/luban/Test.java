package com.luban;

import com.luban.config.Appconfig;
import com.luban.service.C;
import com.luban.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(Appconfig.class);
		C bean =(C) ac.getBean("indexService");
		System.out.println(bean);
	}
}
