package week1;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
public class Q2 {
    public static void main(String[] args) {

        /*TEXT1.txt*/
        /*String path = "D:\\_a_Lecture Notes FSKTM\\_Semester 2\\WIA1002_DataStructures\\_Labs & Tutorials\\src\\week1\\L\\text1.txt";
        System.out.println("~~text1.txt~~");
        int count = 0;
        try{
            Scanner inText = new Scanner(new FileInputStream(path));
            while(inText.hasNextLine()){
                String letters = toString(inText.nextLine().split(","));
                for(int i=0; i<letters.length(); i++)
                    if(letters.charAt(i) != ' ') count++;
                System.out.println(letters);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        System.out.println("Number of characters: "+count);*/

        /*TEXT2.txt*/
        /*String path = "D:\\_a_Lecture Notes FSKTM\\_Semester 2\\WIA1002_DataStructures\\_Labs & Tutorials\\src\\week1\\L\\text2.txt";
        System.out.println("~~text2.txt~~");
        int count = 0;
        try{
            Scanner inText = new Scanner(new FileInputStream(path));
            while(inText.hasNextLine()){
                String letters = toString(inText.nextLine().split(","));
                for(int i=0; i<letters.length(); i++)
                    if(letters.charAt(i) != ' ') count++;
                System.out.println(letters);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        System.out.println("Number of characters: "+count);*/

        /*TEXT3.txt*/
        /*String path = "D:\\_a_Lecture Notes FSKTM\\_Semester 2\\WIA1002_DataStructures\\_Labs & Tutorials\\src\\week1\\L\\text3.txt";
        System.out.println("~~text3.txt~~");
        int count = 0;
        try{
             Scanner inText = new Scanner(new FileInputStream(path));
             while(inText.hasNextLine()){
                  String letters = toString(inText.nextLine().split(";"));
                  for(int i=0; i<letters.length(); i++)
                      if(letters.charAt(i) != ' ') count++;
                  System.out.println(letters);
             }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        System.out.println("Number of characters: "+count);*/

        /*TEXT4.txt*/
        /*String path = "D:\\_a_Lecture Notes FSKTM\\_Semester 2\\WIA1002_DataStructures\\_Labs & Tutorials\\src\\week1\\L\\text4.txt";
        System.out.println("~~text4.txt~~");
        int count = 0;
        try{
             Scanner inText = new Scanner(new FileInputStream(path));
             while(inText.hasNextLine()){
                  String letters = inText.nextLine().replaceAll("\\d", " ").trim().replaceAll("\\s{2,}", " ");
                  for(int i=0; i<letters.length(); i++)
                      if(letters.charAt(i) != ' ') count++;
                  System.out.println(letters);
             }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
        System.out.println("Number of characters: "+count);*/
    }

    public static String toString(String[] str){
        String temp = "";
        for(int i=0; i<str.length; i++)
            temp += str[i];
        return temp;
    }
}
