# RPG Character Program

This Java program demonstrates object-oriented programming concepts by creating an RPG character class and using constructors, getter, and setter methods.

## Author

- Aaron Hirtle
- Date: 2025-01-25
- Class: Intro to Object Oriented Programming PROG1400
- Assignment: Exercise 3

## Code Explanation

The program consists of two classes:

### 1. `Main` Class:
- This is the main driver class that creates instances of the `RPGCharacter` class.
- It creates two characters: one using the parameterized constructor and another using the no-argument constructor.
- It sets the properties of the second character using setter methods.
- Then, it displays the character information using getter methods.

### 2. `RPGCharacter` Class:
- This class represents an RPG character with attributes: `name`, `role`, `health`, and `strength`.
- It has two constructors:
  - A no-argument constructor that sets default values for the character.
  - A parameterized constructor that accepts values for `name`, `role`, `health`, and `strength`.
- It includes getter and setter methods to access and modify the character attributes.

## How to Run

1. Save both classes in separate files: `Main.java` and `RPGCharacter.java`.
2. Open a terminal or command prompt.
3. Navigate to the directory containing the files.
4. Compile both classes by running:
   ```
   javac Main.java RPGCharacter.java
   ```
5. Run the program by executing:
   ```
   java Main
   ```

## Output Example

```
**Character One**
Name: Cloud
Role: Hero
Health: 90
Strength: 25

**Character Two**
Name: Sephiroth
Role: Villain
Health: 500
Strength: 60
```

## Description

This program showcases the use of constructors, encapsulation, and method calls in an object-oriented design. It creates RPG characters, assigns attributes, and displays the information in a simple, user-friendly format.
```
