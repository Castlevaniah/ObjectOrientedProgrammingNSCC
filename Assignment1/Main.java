import java.util.ArrayList;  // Import ArrayList to store students
import java.util.Scanner;    // Import Scanner for user input

public class Main {
    
    private static ArrayList<Student> studentList = new ArrayList<>();  // List to store students

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner for input
        int choice;  // Store menu choice

        // Menu loop
        do {
            // Display menu
            System.out.println("\n ::::::::  ::::    ::::   ::::::::  \r\n" + //
                                ":+:    :+: +:+:+: :+:+:+ :+:    :+: \r\n" + //
                                "+:+        +:+ +:+:+ +:+ +:+        \r\n" + //
                                "+#++:++#++ +#+  +:+  +#+ +#++:++#++ \r\n" + //
                                "       +#+ +#+       +#+        +#+ \r\n" + //
                                "#+#    #+# #+#       #+# #+#    #+# \r\n" + //
                                " ########  ###       ###  ########  ");
            System.out.println("\n*-*-*- STUDENT MANAGEMENT SYSTEM MENU -*-*-*");
            System.out.println("1. ADD NEW STUDENT");
            System.out.println("2. DISPLAY STUDENT DETAILS");
            System.out.println("3. SEARCH BY STUDENT ID");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Handle user choice
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    System.out.println("THANK YOU FOR USING SMS. GOODBYE!");
                    break;
                default:
                    System.out.println("INVALID CHOICE! TRY AGAIN.");
            }
        } while (choice != 4);  // Loop until exit

        scanner.close();  // Close scanner
    }
    
    // Add a student
    private static void addStudent(Scanner scanner) {
        System.out.print("ENTER NAME: ");
        String name = scanner.nextLine();
        
        System.out.print("ENTER AGE: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("ENTER ADDRESS: ");
        String address = scanner.nextLine();
        
        System.out.print("ENTER MAJOR: ");
        String major = scanner.nextLine();
        
        System.out.print("ENTER GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        // Create and add student to list
        Student student = new Student(name, age, address, major, gpa);
        studentList.add(student);
        
        System.out.println("STUDENT ADDED WITH ID: " + student.getStudentId());
    }
    
    // Display all students
    private static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("NO STUDENTS FOUND.");
        } else {
            for (Student s : studentList) {
                System.out.println("\n-------------------------");
                s.displayDetails();
            }
        }
    }
    
    // Search for a student by ID
    private static void searchStudent(Scanner scanner) {
        System.out.print("ENTER STUDENT ID: ");
        String searchId = scanner.nextLine();
        boolean found = false;
        
        for (Student s : studentList) {
            if (s.getStudentId().equalsIgnoreCase(searchId)) {
                System.out.println("STUDENT FOUND:");
                s.displayDetails();
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("STUDENT NOT FOUND.");
        }
    }
}
