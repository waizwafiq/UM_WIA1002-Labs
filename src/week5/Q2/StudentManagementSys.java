package week5.Q2;

import java.util.Scanner;
public class StudentManagementSys {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        SLL<String> nameList = new SLL<>();

        System.out.println("Enter your student name list. Enter 'n' to end...");
        String input, opt;

        do{
            input = key.nextLine();
            if(!input.equals("n"))
                nameList.add(input);
        }while(!input.equals("n"));

        System.out.println("You have entered the following students' name : ");
        nameList.printList();

        System.out.println("\nThe number of students entered is : "+nameList.getSize());

        do{
            System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
            opt = key.next();

            if(opt.equals("r"))
                rename(nameList);
            else if(!opt.equals("n"))
                System.out.println("Invalid input!");

        }while(!opt.equals("n"));

        do {
            System.out.print("\nDo you want to remove any of your student name? ");
            System.out.println("Enter 'y' for yes, 'n' to proceed.");
            opt = key.next();

            if(opt.equals("y"))
                delete(nameList);
            else if(!opt.equals("n"))
                System.out.println("Invalid input!");
        }while(!opt.equals("n"));

        System.out.println("All student data captured complete. Thank you!");
    }

    public static void rename(SLL<String> nameList){
        Scanner key = new Scanner(System.in);
        String name;

        System.out.println("\nEnter the existing student name that you would like to rename: ");
        while(true){
            name = key.nextLine();
            if(nameList.contains(name))
                break;
            else
                System.out.println("Name does not exist in the database!");
        }

        System.out.println("\nEnter new name: ");
        String newName = key.nextLine();

        nameList.replace(name, newName);
    }

    public static void delete(SLL<String> nameList){
        Scanner key = new Scanner(System.in);
        String name;

        System.out.println("\nEnter the existing student name that you would like to remove: ");
        while(true){
            name = key.nextLine();
            if(nameList.contains(name))
                break;
            else
                System.out.println("Name does not exist in the database!");
        }

        nameList.removeElement(name);
        System.out.println("\nThe number of updated student is : "+nameList.getSize());
        System.out.println("The updated students list is:");
        nameList.printList();
    }
}