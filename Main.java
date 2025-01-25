/***********************************************************************
 * Author: Aaron Hirtle                                                  
 * Date:   2025-01-25                                                
 * Class:  Intro to Object Oriented Programming PROG1400              
 * Assignment: Exercise 3                                              
 ***********************************************************************/

 public class Main {
    public static void main(String[] args) {
        // Create new RPGCharacter using both constructors
        RPGCharacter character1 = new RPGCharacter("Cloud", "Hero", 90, 25); // Parameterized Constructor
        RPGCharacter character2 = new RPGCharacter(); // No-argument Constructor

        // Setters Character Two
        character2.setName("Sephiroth");
        character2.setRole("Villain");
        character2.setHealth(500);
        character2.setStrength(60);

        // Getters Character One
        System.out.println("**Character One**");
        System.out.println("Name: " + character1.getName());
        System.out.println("Role: " + character1.getRole());
        System.out.println("Health: " + character1.getHealth());
        System.out.println("Strength: " + character1.getStrength());

        // Getters Character Two
        System.out.println("\n**Character Two**");
        System.out.println("Name: " + character2.getName());
        System.out.println("Role: " + character2.getRole());
        System.out.println("Health: " + character2.getHealth());
        System.out.println("Strength: " + character2.getStrength());
    }
}
