import java.util.*;

public class Function {
    // Function to print the provided name
    public static void printMyName(String name){
        System.out.println(name);
        return; // Exits the method
    }

    public static void main(String[] args){
        // Creating Scanner object to take input
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();

        System.out.print("Your name is : ");
        // Calling the function
        printMyName(Name);

        sc.close();
    }
}