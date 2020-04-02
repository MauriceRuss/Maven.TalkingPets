package io.zipcoder.polymorphism;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer amount = askNumberOfPet(scanner);
        Pet[] pets = askTypesAndNamesToPet(scanner,amount);
        System.out.println(petSpeak(pets));
    }


    public static String listPets(Integer numberOfPets, String[] petTypes, String[] petNames) {
        String result = "";
        for(Integer index = 0; index < numberOfPets; index++)
            result += String.format("%s %s\n", petTypes[index], petNames[index]);

        return result;
    }

    public static String petSpeak(Pet[] pets) {
        String result = "";

        for(Pet pet: pets)
            result += String.format("%s the %s says %s\n",
                    pet.getName(), typeOfPetInString(pet), pet.speak());
        return result.substring(0,result.length()-1);
    }


    private static String typeOfPetInString(Pet pet){
        if(pet instanceof Cat)
            return "cat";
        else if (pet instanceof Dog)
            return "dog";
        else if (pet instanceof Snake)
            return "snake";
        else
            return null;
    }

    private static Integer askNumberOfPet(Scanner scanner){
        System.out.println("How many io.zipcoder.polymorphism.polymorphism.pets do you have?");
        return scanner.nextInt();
    }

    private static String askTypesAndNamesToString(Scanner scanner, Integer amount){
        String[] typeOfPets = new String[amount];
        String[] petNames = new String[amount];

        for(Integer index = 0; index < amount; index++) {
            System.out.println("What kind of pet is pet " + (index+1) + "?");
            typeOfPets[index] = scanner.next();
            System.out.println("What is the the name of pet " + (index+1) + "?");
            petNames[index] = scanner.next();
        }

        return listPets(amount, typeOfPets, petNames);
    }

    private static Pet[] askTypesAndNamesToPet(Scanner scanner, Integer amount){
        String[] typeOfPets = new String[amount];
        String[] petNames = new String[amount];
        Pet[] pets = new Pet[amount];

        for(Integer index = 0; index < amount; index++) {
            System.out.println("What kind of pet is pet " + (index+1) + "?");
            Pet pet = createPet(scanner.next());
            System.out.println("What is the the name of pet " + (index+1) + "?");
            pet.setName(scanner.next());
            pets[index] = pet;
        }
        return pets;
    }

    private static Pet createPet(String petType){
        if(petType.equals("dog"))
            return new Dog();
        else if(petType.equals("cat"))
            return new Cat();
        else if(petType.equals("snake"))
            return new Snake();
        else
            return null;
    }
}
