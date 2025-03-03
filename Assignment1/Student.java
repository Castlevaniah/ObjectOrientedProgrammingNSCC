/***********************************************************************
 * Author: Aaron Hirtle                                                  
 * Date:   2025-03-02                                                
 * Class:  Intro to Object Oriented Programming PROG1400              
 * Assignment #1                                             
 ***********************************************************************/

// Student class extends Person (inherits properties and methods)
public class Student extends Person {
    
    // Static variable to generate unique student IDs
    private static int idCounter = 1000;
    
    // Student-specific attributes
    private String studentId;
    private String major;
    private double gpa;
    
    // Constructor with parameters
    public Student(String name, int age, String address, String major, double gpa) {
        super(name, age, address); // Call the constructor of Person
        this.studentId = generateStudentId(); // Assign a unique ID
        this.major = major;
        this.gpa = gpa;
    }
    
    // Default constructor (creates a student with default values)
    public Student() {
        super("Unknown", 0, "Unknown");
        this.studentId = generateStudentId();
        this.major = "Undeclared";
        this.gpa = 0.0;
    }
    
    // Generates a unique student ID
    public static String generateStudentId() {
        return "S" + (idCounter++);
    }
    
    // Getter for student ID 
    public String getStudentId() {
        return studentId;
    }
    
    // Getter and setter for major
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    // Getter and setter for GPA
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    // Override method to display student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call displayDetails() from Person class
        System.out.println("STUDENT ID : " + studentId);
        System.out.println("MAJOR      : " + major);
        System.out.println("GPA        : " + gpa);
    }
}
