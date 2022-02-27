package lab2.basics;

public class Lab02Examples {
    public static void main(String[] args) {
        new Lab02Examples().run();
    }

    public void run() {
        //conditional statements

        /*
        if (condition) {
        } else if (other condition) {
        } else { everything else }
         */

        int i = 32;
        if (i > 0) {
            System.out.println("i > 0 condition met");
        } else if (i == 0) {
            System.out.println("i == 0 condition met");
        } else {
            System.out.println("All other cases");
        }

        //more complicated conditions
        if (i > 30 && i < 40) {
        } //and - both conditions required to be fulfilled, also, if i > 30 is false, second condition will not be checked

        if (i >= 50 || i < 10) {
        } //or - only one condition required to be fulfilled, also if i >= 50, the second condition will not be checked

        boolean b = false;

        if (b) {
        } // boolean values are checked without additional operators, the same like if (b == true)

        if (!b) {
        } // not b -> the same like if (b == false)


        //loops

        int it;
        //loop that starts with 0, goes up to less 10 (9) and changes it by increasing it every iteration (at the end of loop)
        for (it = 0; it < 10; it++) {
            System.out.println(it);
        }

        //same as above but using while loop
        it = 0;
        while (it < 10) {
            System.out.println(it);
            it++;
        }

        //loop that starts from 10 counting downwards
        for (it = 10; it > 0; it--) {
            System.out.println(it);
        }

        //same as above but using while loop
        it = 10;
        while (it > 0) {
            System.out.println(it);
            it--;
        }

        //print only even numbers:

        for (int j = 2 ; j < 20 ; j += 2) {
            System.out.println(j);
        }

        /* exercises before lab */
        /*
        These are not obligatory, but may help you to understand and get familiar with coding a simple programs in Java
         */

        /*
        1. Write a simple program that scans for your age and prints different messages based on the value that you pass:
        for example if you are older than 30, then the program may write "oh, you're old", if the value is less than 15,
        the program can write something like "hello kiddo". Make sure that program is safe for negative input (-10)

        2. Write a simple temperature converter that converts between Kelvin, Fahrenheit and Celsius degrees. The program
        should accept an input value of temperature and second input of letter ('K', 'F', 'C') which is the type of degree
        you are passing. As the output program prints converted values of input temperature.

        3. Write a simple program that prints values starting from a to b, where a and b are values that you enter when asked by
        your program. If a > b - count downwards, if a < b count upwards. Write a solution using for and while loop.

        4. Write a program that counts how many numbers are divisible by 5 in a given region (for example from 231 to 1206)
         */
    }
}
