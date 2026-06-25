// Problem: Make a function to calculate and print the factorial of a number.
import java.util.*;

public class Calculate_Factorial {
    
    public static void CalculateFactorial(int n) {
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }

        // Initializing factorial variable to 1
        int factorial = 1;
        // Loop to multiply numbers from n down to 1
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        // Printing the final result
        System.out.println(factorial);
    }

public static void main(String[]args) {
    // Creating Scanner object to take input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of N: ");
    int n = sc.nextInt();

    // Calling the function to calculate factorial
    CalculateFactorial(n);

    // Closing the scanner to prevent resource leaks
    sc.close();
    
    }
}