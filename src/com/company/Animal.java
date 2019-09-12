package com.company;

public class Animal {

    private String name;

    public void  makesound(){
        System.out.println("grrrr");
    }
    public void makesound(String soundType){
        System.out.println(soundType);
    }
    public void makesound(String soundType ,String loudness) {
        System.out.println(soundType +", loudness "+loudness);
    }
}
