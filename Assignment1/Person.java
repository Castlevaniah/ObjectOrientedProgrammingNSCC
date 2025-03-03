// Base class: Person (abstract class)
abstract class Person {
    
    // Private attributes for person's details
    private String name;
    private int age;
    private String address;
    
    // Constructor to initialize person details
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Getter and setter for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter for address
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Method to display person details
    public void displayDetails() {
        System.out.println("NAME    : " + name);
        System.out.println("AGE     : " + age);
        System.out.println("ADDRESS : " + address);
    }
}
