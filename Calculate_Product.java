// Problem: Make a function to multiply 2 numbers and return the product.
import java.util.*;

public class Calculate_Product {
    // Function to calculate the sum of two integers
    public static int calculateProduct(int A,int B){
         return A * B; // Returns the calculated product
    }

public static void main(String[]args) {
    // Creating Scanner object to take input (A & B)
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of A: ");
    int A = sc.nextInt();
    System.out.print("Enter value of B: ");
    int B = sc.nextInt();

    // Printing the result
    System.out.print("Product of A * B : " + calculateProduct(A , B));
    
    // Closing the scanner
    sc.close();
    
    }
}