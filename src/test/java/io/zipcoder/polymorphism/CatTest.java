package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void setNameTest() {
        Cat cat = new Cat("null");
        cat.setName("Jeff");
        String expected = "Jeff";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Cat cat = new Cat("Jeff");
        String expected = "Jeff";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat("Jeff");
        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}
