package com.springinaction.chapter01.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("hello.xml").getBeanFactory();

        GreetingService greetingService = (GreetingService) beanFactory.getBean("greetingService");

        greetingService.sayGreeting();
    }
}
