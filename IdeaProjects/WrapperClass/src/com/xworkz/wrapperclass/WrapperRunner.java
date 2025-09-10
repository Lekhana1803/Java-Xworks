package com.xworkz.wrapperclass;

public class WrapperRunner {

    public static void main(String[] args) {
        WrapperClass obj = new WrapperClass();

        System.out.println("Primitive int age: " + obj.age);
        System.out.println("Wrapper Integer ages: " + obj.ages);

        System.out.println("Primitive double price: " + obj.price);
        System.out.println("Wrapper Double prices: " + obj.prices);

        System.out.println("Primitive short score: " + obj.score);
        System.out.println("Wrapper Short scores: " + obj.scores);

        System.out.println("Primitive long phoneNum: " + obj.phonenum);
        System.out.println("Wrapper Long phoneNumber: " + obj.phoneNumber);

        System.out.println("Primitive float value: " + obj.value);
        System.out.println("Wrapper Float values: " + obj.values);

        System.out.println("Primitive boolean isFemale: " + obj.isFemale);
        System.out.println("Wrapper Boolean isfemale: " + obj.isfemale);

        System.out.println("Primitive byte Age: " + obj.Age);
        System.out.println("Wrapper Byte Ages: " + obj.Ages);

        System.out.println("Primitive char initial: " + obj.initial);
        System.out.println("Wrapper Character Initial: " + obj.Initial);
    }
}
