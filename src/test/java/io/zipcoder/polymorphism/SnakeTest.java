package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {
    @Test
    public void setNameTest() {
        Snake snake = new Snake("null");
        snake.setName("Jeff");
        String expected = "Jeff";
        String actual = snake.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Snake snake = new Snake("Jeff");
        String expected = "Jeff";
        String actual = snake.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        Snake snake = new Snake("Jeff");
        String expected = "hiss";
        String actual = snake.speak();
        Assert.assertEquals(expected, actual);
    }

}
