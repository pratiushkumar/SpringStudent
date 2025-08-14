package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ApplicationContext context  =  new  ClassPathXmlApplicationContext("beans.xml");
System.out.println("Container is started " );
//        HelloService hello =  (HelloService) context.getBean("helloBean");
//        System.out.println("bean id is :"+ Arrays.toString(context.getBeanDefinitionNames()));
//        hello.sayHello();

        Teacher teach =  context.getBean("teacher",Teacher.class);
        teach.showCourses();


    }
}