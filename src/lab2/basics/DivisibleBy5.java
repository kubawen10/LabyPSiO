package lab2.basics;
/*4. Write a program that counts how many numbers are divisible by 5 in a given region (for example from 231 to 1206)*/

import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scannerObj.nextInt();
        System.out.print("Enter b: ");
        int b = scannerObj.nextInt();

        //including boundries?
        int ans = (b-a)/5 + 1;
        System.out.println("Number of numbers divisible by 5 between " + a + " and "+ b +": "+ans);

    }
}
