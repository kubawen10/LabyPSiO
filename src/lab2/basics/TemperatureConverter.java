package lab2.basics;

/*2. Write a simple temperature converter that converts between Kelvin, Fahrenheit and Celsius degrees. The program
        should accept an input value of temperature and second input of letter ('K', 'F', 'C') which is the type of degree
        you are passing. As the output program prints converted values of input temperature.*/

import java.util.Scanner;
import java.util.concurrent.Flow;

public class TemperatureConverter {
    public static void main(String[] args) {
        int CLow = -273;
        int KLow = 0;
        int FLow = -460;

        //temp and scale letter input, skips scale when nextLine?
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int t = scannerObj.nextInt();
        System.out.print("Enter what scale it is: ");
        String scale = scannerObj.next();


        //makes sure that scale is either K or C or F
        while (!(scale.equals("K") || scale.equals("C") || scale.equals("F"))){
            System.out.println("It must be K or C or F!");
            scale = scannerObj.nextLine();
        }

        //dlaczego nie ==
        if (scale.equals("K")){
            System.out.println("to jest K");
        }
        else if (scale=="C"){
            System.out.println("to jest C");
        }
        else{
            System.out.println("nie C i nie K");
        }

        //conversions
        if (scale.equals("K")){
            while (t<KLow){
                System.out.println("Kelvins are greater or equal to " + KLow);
                t = scannerObj.nextInt();
            }
            System.out.println(t+"K to Celsius: " + (t-273));
            System.out.println(t+"K to Fahrenheit: " + (2*(t-273)+32));
        }
        else if (scale.equals("F")){
            while (t<FLow){
                System.out.println("Fahrenheits are greater or equal to " + FLow);
                t = scannerObj.nextInt();
            }
            System.out.println(t+"F to Celsius: " + ((t - 32) / 2));
            System.out.println(t+"F to Kelvin: " + (((t - 32) / 2) + 273));
        }
        else if (scale.equals("C")){
            while (t<CLow){
                System.out.println("Celsius are greater or equal to " + CLow);
                t = scannerObj.nextInt();
            }
            System.out.println(t+"C to Kelvin: " + (t+273));
            System.out.println(t+"C to Fahrenheit: " + (2*t+32));
        }


    }
}
