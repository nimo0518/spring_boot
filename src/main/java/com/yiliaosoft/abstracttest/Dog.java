package com.yiliaosoft.abstracttest;

public class Dog  extends Animal{
    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("aaaaa----------------");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.drink();
    }
}
