package com.company;

public class Main {

    public static void main(String[] args) {

         Vet myvet=new Vet();

         Cat myCat=new Cat();
         Dog mydog=new Dog();

         myvet.giveShot(myCat);
         myvet.giveShot(mydog);
        System.out.println("*******************************************************************");

          mydog.makesound();
          mydog.makesound("wooff!");
          mydog.makesound("woof","very loud!");

        mydog.move();
        mydog.makesound();
        mydog.makesound("another woof....");
    }
}
