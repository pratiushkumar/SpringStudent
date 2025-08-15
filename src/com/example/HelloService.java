package com.example;

public class HelloService {
    private String hello;
    private int value=0;
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
    public int yooper(int value) {
        this.value = value;
        return value;
    }
}
