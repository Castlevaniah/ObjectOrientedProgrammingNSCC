# Student Management System

## Author
Aaron Hirtle

## Date
March 2, 2025

## Class
Intro to Object-Oriented Programming (PROG1400)

## Assignment
Assignment #1

## Description
This is a simple Student Management System implemented in Java. The system allows users to:
- Add new students
- Display all student details
- Search for students by ID
- Exit the application

## Features
- Uses an `ArrayList` to store student records.
- Implements an abstract `Person` class as a base for the `Student` class.
- Provides a menu-driven interface for user interaction.
- Generates unique student IDs automatically.

## How to Run
1. Compile the Java files:
   ```sh
   javac Main.java Student.java Person.java
   ```
2. Run the program:
   ```sh
   java Main
   ```

## Classes
- **Main**: Contains the main program logic and user interface.
- **Person**: Abstract base class that defines common attributes and methods for a person.
- **Student**: Extends `Person` and includes additional student-specific attributes like major, GPA, and a unique student ID.

## Usage
- Run the program and follow the on-screen prompts.
- Enter student details when prompted.
- Search for students by their unique ID.
- View all stored students in the system.



