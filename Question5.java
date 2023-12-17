/*Write a program to create a file that stores the details of five products which include
product code, cost, and number of items available and are provided through the
keyboard. Also compute and print the total value of all the five products. You can use
your own values. The output.txt shown below shows the expected output format.

output.txt:

Product Code: 101
Cost: Rs 100.00
Quantity: 2
Total Value: Rs 200.00
Product Code: 102
Cost: Rs 200.00
Quantity: 3
Total Value: Rs 600.00
Product Code: 103
Cost: Rs 300.00
Quantity: 0
Total Value: Rs 0.00

Product Code: 104
Cost: Rs 500.00
Quantity: 15
Total Value: Rs 7500.00
Product Code: 105
Cost: Rs 300.00
Quantity: 4
Total Value: Rs 1200.00
Total Value of All Products: Rs 9500.00 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        final int n = 5;
        double totalValue = 0.0;
        File outputFile = new File("output1.txt");

        try (FileWriter w1 = new FileWriter(outputFile)) {
            for (int i = 1; i <= n; i++) {
            
                System.out.println("Enter product " + i + " details:");
                System.out.print("Product Code: ");
                int productCode = sc.nextInt();
                sc.nextLine();

                System.out.print("Cost (Rs): ");
                double cost = sc.nextDouble();
                sc.nextLine();

                System.out.print("Quantity: ");
                int quantity = sc.nextInt();
                sc.nextLine();

                double productValue = cost * quantity;
                totalValue += productValue;

                w1.write("Product Code: " + productCode + "\n");
                w1.write("Cost: Rs " + String.format("%.2f", cost) + "\n");
                w1.write("Quantity: " + quantity + "\n");
                w1.write("Total Value: Rs " + String.format("%.2f", productValue) + "\n\n");
            }

            w1.write("Total Value of All Products: Rs " + String.format("%.2f", totalValue));
        } 

            sc.close();

        System.out.println("Task completed...");
    }
}
