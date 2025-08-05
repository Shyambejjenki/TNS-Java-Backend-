public class Demovariablestypes{

    // Static variable (shared by all objects)
    static String companyName = "Accenture";

    // Instance variables (unique to each object)
    int employeeId;
    String employeeName;

    // Constructor to initialize instance variables
    public Demovariablestypes(int id, String name) {
        // Local variable (only within this constructor)
        int bonus = 1000;

        employeeId = id;
        employeeName = name;

        System.out.println("Constructor Bonus: " + bonus); // Using local variable
    }

    // Method to display employee details
    public void displayDetails() {
        // Local variable (only within this method)
        int year = 2025;

        System.out.println("Company Name (Static): " + companyName);
        System.out.println("Employee ID (Instance): " + employeeId);
        System.out.println("Employee Name (Instance): " + employeeName);
        System.out.println("Year (Local): " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Creating first object
        Demovariablestypes emp1 = new Demovariablestypes(101, "Shyam");
        emp1.displayDetails();

        // Creating second object
        Demovariablestypes emp2 = new Demovariablestypes(102, "Abhishek");
        emp2.displayDetails();
    }
}
