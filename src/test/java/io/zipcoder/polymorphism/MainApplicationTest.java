package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {


    @Test
    public void listPetsTest() {
        Integer numberOfPets = 3;
        String[] petTypes = {"Dog", "Cat", "Snake"};
        String[] petNames = {"Bruno", "Karma", "Elwood"};

        String expected = "Dog Bruno\n Cat Karma\n Snake Elwood\n";
        String actual = MainApplication.listPets(numberOfPets, petTypes, petNames);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void petSpeakTest() {
        Dog dog = new Dog("Bruno");
        Cat cat = new Cat("Karma");
        Snake snake = new Snake("Elwood");
        Pet[] pets = {dog, cat, snake};

        String expected = "Bruno the dog says woof\n Karma the cat says meow\n Elwood the snake says hiss";
        String actual = MainApplication.petSpeak(pets);
        Assert.assertEquals(expected, actual);

    }
}
