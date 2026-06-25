// Problem: Make a function to add 2 numbers and return the sum.
import java.util.*;

public class Calculate_Sum {
    // Function to calculate the sum of two integers
    public static int calculateSum(int A,int B){
         int sum = A + B;
         return sum; // Returns the calculated sum
    }

public static void main(String[]args) {
    // Creating Scanner object to take input (A & B)
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of A: ");
    int A = sc.nextInt();
    System.out.print("Enter value of B: ");
    int B = sc.nextInt();

    // Calling the calculateSum function and storing the result
    int Sum = calculateSum(A , B);

    // Printing the result
    System.out.print("Sum of A + B : " + Sum );
    
    // Closing the scanner
    sc.close();
    
    }
}