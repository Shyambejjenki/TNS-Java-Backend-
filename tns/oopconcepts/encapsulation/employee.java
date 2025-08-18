package tns.oopconcepts.encapsulation;

public class employee {
    // Private fields for encapsulation
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        employee employee = new employee();

        // Using setter methods to set values
        employee.setName("shyam");
        employee.setAge(30);
        
        // Using getter methods to retrieve values
        System.out.println("employee's Name: " + employee.getName());
        System.out.println("emplyee's Age: " + employee.getAge());
    
    }
}
