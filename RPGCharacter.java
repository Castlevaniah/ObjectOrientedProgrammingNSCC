/***********************************************************************
 * Author: Aaron Hirtle                                                  
 * Date:   2025-01-25                                                
 * Class:  Intro to Object Oriented Programming PROG1400              
 * Assignment: Exercise 3                                             
 ***********************************************************************/

 public class RPGCharacter {
    private String name;
    private String role;  
    private int health;
    private int strength;

    // No-argument Constructor
    public RPGCharacter() {
        this.name = "Unknown";
        this.role = "Warrior";
        this.health = 100;
        this.strength = 10;
    }

    // Parameterized Constructor
    public RPGCharacter(String name, String role, int health, int strength) {
        this.name = name;
        this.role = role;
        this.health = health;
        this.strength = strength;
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
