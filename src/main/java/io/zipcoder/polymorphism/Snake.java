package io.zipcoder.polymorphism;

public class Snake extends Pet {
    public Snake(){
        super("BElwood");
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}
