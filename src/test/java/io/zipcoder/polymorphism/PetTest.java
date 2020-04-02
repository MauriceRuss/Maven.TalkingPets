package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void dogIsPetTest() {
        Pet dog = new Dog("null");
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void catIsPetTest() {
        Pet cat = new Cat("null");
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void snakeIsPetTest() {
        Pet snake = new Snake("null");
        Assert.assertTrue(snake instanceof Pet);
    }
}
