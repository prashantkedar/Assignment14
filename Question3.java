/*Write a program that will count the number of characters, words, lines in a file.
Use input.txt file as input.
Output:
Character Count: 104
Word Count: 18
Line Count: 4 */

import java.io.*; 
  
public class Question3 { 
    public static void main(String[] args) throws IOException  { 
       
        File file = new File("input.txt"); 

        FileInputStream fis = new FileInputStream(file); 
        InputStreamReader isr = new InputStreamReader(fis); 
        BufferedReader br = new BufferedReader(isr); 
  
        String line; 
        int wordCount = 0;
        int characterCount = 0; 
        int paraCount = 0; 
        int SpaceCount = 0; 
        int lineCount = 0; 
  
        while ((line = br.readLine()) != null) { 
            if (line.equals("")) { 
                paraCount += 1; 
            } 
            else { 
                characterCount += line.length(); 
                String words[] = line.split("\\s+"); 
                wordCount += words.length; 
                SpaceCount += wordCount - 1; 
                String sentence[] = line.split("[!?.:]+"); 
                lineCount += sentence.length; 
            } 
        } 
        if (lineCount >= 1) { 
            paraCount++; 
        } 
        System.out.println("Total word count = "+ wordCount); 
        System.out.println("Total number of lines = "+ lineCount); 
        System.out.println("Total number of characters = "+ characterCount); 
        
    } 
}