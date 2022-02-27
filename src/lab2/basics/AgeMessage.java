package lab2.basics;
/*
        1. Write a simple program that scans for your age and prints different messages based on the value that you pass:
        for example if you are older than 30, then the program may write "oh, you're old", if the value is less than 15,
        the program can write something like "hello kiddo". Make sure that program is safe for negative input (-10)*/

import java.util.Scanner;  // Import the Scanner class

public class AgeMessage {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your age");

        int userAge = scannerObj.nextInt();  // Read user input

        //Make sure that age is a positive number
        while (userAge<0){
            System.out.println("Enter your age (positive number)");
            userAge = scannerObj.nextInt();
        }

        if (userAge < 18){
            System.out.println("No beer for you, want some juice?");
        }
        else if (userAge>=18 && userAge<=60){
            System.out.println("Grab a bear mate!");
        }
        else{
            System.out.println("Hope your liver can handle it");
        }
    }
}
