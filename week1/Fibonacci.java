package week1;

import java.util.Random;

/**
 * Program that prints first n fibonacci numbers for the given value n
 */
public class Fibonacci {
    public static void main(String[] args) {
        // Create instance of Random class
        Random rand = new Random();
        // Generate a random integer in range 0 to 99
        int n = rand.nextInt(100);
        // Print all fibonacci numbers till n 
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    /**
     * input: n 
     * output: nth fibonacci number
     */
    public static int fibonacci(int n) {
        // Base condition
        if (n == 0 || n == 1)
            return n;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
