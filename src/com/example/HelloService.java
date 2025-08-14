package com.example;

public class HelloService {
    private String hello;

    public void setHello(String hello ) {
        this.hello = hello;
    }
    public void sayHello() {
        System.out.println(hello);
    }
    public void init() {
        System.out.println("init");
    }
    public void destroy() {
        System.out.println("destroy");
    }
}
