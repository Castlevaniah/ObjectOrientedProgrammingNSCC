/***********************************************************************
 * Author: Aaron Hirtle                                                  
 * Date:   2025-01-18                                               
 * Class:  Intro to Object Oriented Programming PROG1400                                                 
 * Assignment: Exercise 2                           
 ***********************************************************************/



public class Main {
    public static void main(String[] args) {
        // Create new RPG objects
        RPGCharacter character1 = new RPGCharacter("Cloud", "Hero", 90, 25);
        RPGCharacter character2 = new RPGCharacter("Sephiroth", "Villain", 500, 60);

        // Setters
        character1.setHealth(90);
        character1.setStrength(25);

        // Getters
        System.out.println("**Character One**");
        System.out.println("Name: " + character1.getName());
        System.out.println("Role: " + character1.getRole());
        System.out.println("Health: " + character1.getHealth());
        System.out.println("Strength: " + character1.getStrength());

        System.out.println("\n**Character Two**");
        System.out.println("Name: " + character2.getName());
        System.out.println("Role: " + character2.getRole());
        System.out.println("Health: " + character2.getHealth());
        System.out.println("Strength: " + character2.getStrength());
    }
}