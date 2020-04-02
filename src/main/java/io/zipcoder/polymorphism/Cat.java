package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public Cat(){
        super("Karma");
    }

    @Override
    public String speak() {
        return "meow";
    }
}
