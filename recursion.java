/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ashin
 */
public class recursion {

    /**
     * @param args the command line arguments
     */
 


    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5;  // You can change this number to test other inputs
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
