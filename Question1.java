/*Write a Java program that reads a list of integers from the user and throws an
exception if any numbers are duplicates.
Test Case : Input the Integers 1 2 3 3 4 5
Error: Duplicate number found: 3
Test Case: Input 1 2 3 4 5 6
No duplicate numbers! */

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Number: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                System.err.println("Error: Duplicate number found: " + numbers[i]);
                return;
                }
                
            }
                
            
        }

        System.out.println("No duplicate numbers!");

    }
}
