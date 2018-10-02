package com.intellij.AbstractInterfaces;

public class AbstractClassImplements
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Doggie");

        dog.breathe();
        dog.eat();

        Bird bird = new Bird("pajaro");
        bird.breathe();
        bird.eat();
    }
}
