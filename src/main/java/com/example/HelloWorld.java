package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloWorld {
    private String message;
    
    public HelloWorld() {
        this.message = "Hello, World!";
    }
    
    public HelloWorld(String message) {
        this.message = message;
    }
    
    public String greet() {
        return message;
    }
    
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.greet());
    }
}

