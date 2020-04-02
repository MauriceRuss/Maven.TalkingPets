package io.zipcoder.polymorphism;

public class Snake extends Pet {
    public Snake(){
        super("Elwood");
    }

    public Snake(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}
