//Demo for taking input from user using Scanner
import java.util.Scanner;
public class if_else_statements {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Take input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // If-else condition
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println(" OOH!Sorry, you are not eligible to vote.");
        }

        sc.close(); 
    }
}
    
