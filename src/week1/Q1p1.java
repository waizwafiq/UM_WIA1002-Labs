package week1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q1p1 {
    public static void main(String[] args) {
        String path = "D:\\_a_Lecture Notes FSKTM\\_Semester 2\\WIA1002_DataStructures\\_Labs & Tutorials\\src\\week1\\L\\WaizWafiq_17203410.txt";
        try {
            Scanner inText = new Scanner(new FileInputStream(path));
            while(inText.hasNext()){
                System.out.println(inText.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}
