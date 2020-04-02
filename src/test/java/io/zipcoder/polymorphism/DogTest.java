package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void setNameTest() {
        Dog dog = new Dog("null");
        dog.setName("Jeff");
        String expected = "Jeff";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Dog dog = new Dog("Jeff");
        String expected = "Jeff";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog("Jeff");
        String expected = "woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
