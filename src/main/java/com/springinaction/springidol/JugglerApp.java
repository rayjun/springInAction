package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerApp {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer performer = (Performer) ctx.getBean("duke");

        performer.perform();


        Performer performer1 = (Performer) ctx.getBean("duke1");
        performer1.perform();


        Performer performer2 = (Performer) ctx.getBean("kenny");
        performer2.perform();

    }
}
