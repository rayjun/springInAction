package com.springinaction.chapter01.knight;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightApp {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("knight.xml").getBeanFactory();

        Knight knight = (Knight) factory.getBean("knight1");

        knight.embarkOnQuest();
    }
}
