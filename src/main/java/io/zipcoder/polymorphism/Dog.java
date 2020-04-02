package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(){
        super("Bruno");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof";
    }
}
