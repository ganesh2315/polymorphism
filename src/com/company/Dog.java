package com.company;

public class Dog extends Animal{
    private String name;

    public void move(){
        System.out.println("move!");
    }
    public void makesound(){
        System.out.println("woof....");
    }
    public void makesound(String soundtype){
        System.out.println(soundtype);

    }
}
