/*Write a program that will copy content of one file to another. Use input.txt file as
input.*/

import java.util.*;
import java.io.*;

public class Question4{

    public static void main(String[] args) throws IOException{

    FileInputStream fis = new FileInputStream("input.txt");
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);
        
        Scanner sc = new Scanner(new File("input.txt"));

        FileWriter fw = new FileWriter("output.txt");

        while(sc.hasNextLine()){
            String s = sc.nextLine();
            
            
            fw.write(s +"\n");
        }
        System.out.println("Task completed...");

        sc.close();
        fw.close();

    }
}