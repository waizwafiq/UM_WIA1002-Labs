package week1;

import java.util.Scanner;
import java.io.*;

public class Q1p2 {
    public static void main(String[] args) {
        String path = "D:\\_a_Lecture Notes FSKTM\\_Semester 2\\WIA1002_DataStructures\\_Labs & Tutorials\\src\\week1\\L\\WaizWafiq_17203410.txt";
        Scanner userInput = new Scanner(System.in);
        String userText;
        try {
            PrintWriter outText = new PrintWriter(new FileOutputStream(path, true));
            outText.println();
            //GETTING USER'S INPUT
            do {
                userText = userInput.nextLine(); //user input per line
                if (userText.equals("_end_")) break;

                if (userInput.hasNextLine()) {
                    outText.println(userText);
                    continue;
                }else userText = null;

            } while (userText != null);
            outText.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}

/*
Thursday, 19 March 2021.

        My name is Waiz Wafiq with matrix number, 17203410 . I am
        majoring in Artificial Intelligence. This is my first time taking the
        Data Structure subject. At the moment, I am feeling excited about taking this
        subject. This is because I am expecting to learn a lot of new advanced topics
        related to Programming.

        I acquired A for my previous Programming 1 course. It’s not too bad. So, I
        think I can manage to get A for this DS subject this term. In order
        to do well in the subject, I will do my best to be committed on exploring new
        things related to this subject. Wish me luck!!!
*/
