package com.learning.spring.springioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-ioc.xml").getBeanFactory();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");


		SpringIoc springIocFromBeanFactory = (SpringIoc) beanFactory.getBean("springIoc");
		SpringIoc springIocFromApplicationContext = (SpringIoc) applicationContext.getBean("springIoc");

		springIocFromBeanFactory.hellIoc();
		springIocFromApplicationContext.hellIoc();
	}
}
