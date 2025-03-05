/***********************************************************************
 * Author: Aaron Hirtle                                                  
 * Date:   2025-03-02                                                  
 * Class:  Intro to Object Oriented Programming PROG1400               
 * Assignment #1                                                       
 ***********************************************************************/

// Student class inherits from Person
public class Student extends Person {
    
    private static int idCounter = 1000; // Counter for generating student IDs
    
    // Student attributes
    private String studentId;
    private String major;
    private double gpa;
    
    // Constructor with parameters
    public Student(String name, int age, String address, String major, double gpa) {
        super(name, age, address); // Call to Person constructor
        this.studentId = generateStudentId(); // Generate unique ID
        this.major = major;
        this.gpa = gpa;
    }
    
    // Default constructor
    public Student() {
        super("Unknown", 0, "Unknown"); // Default values for Person
        this.studentId = generateStudentId(); // Generate unique ID
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
    
    // Display student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to Person's displayDetails
        System.out.println("STUDENT ID : " + studentId);
        System.out.println("MAJOR      : " + major);
        System.out.println("GPA        : " + gpa);
    }
}
