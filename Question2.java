/*Define an Exception called "NoMatchException" that is thrown when a string is not
equal to 'India'. Write a program that uses this exception. */

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String name = sc.nextLine();

        try {
            Namecheck(name);
        } catch (NoMatchException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void Namecheck(String name) throws NoMatchException {
        if (!name.equals("India")) {
            throw new NoMatchException("Expected 'India', got '" + name + "'");
        }
   
    class NoMatchException extends Exception {

        public NoMatchException(String message) {
            super(message);
        }
    }

}
}