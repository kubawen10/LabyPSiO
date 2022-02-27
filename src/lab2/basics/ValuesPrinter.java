package lab2.basics;
/*3. Write a simple program that prints values starting from a to b, where a and b are values that you enter when asked by
        your program. If a > b - count downwards, if a < b count upwards. Write a solution using for and while loop.
*/
import java.util.Scanner;
public class ValuesPrinter {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scannerObj.nextInt();
        System.out.print("Enter b: ");
        int b = scannerObj.nextInt();

        if (a<=b){
            System.out.println("for loop: ");
            for (int i=a; i<=b; i++){
                System.out.println(i);
            }
            System.out.println("while loop: ");
            while (a<=b){
                System.out.println(a);
                a++;
            }
        }
        else{
            System.out.println("for loop: ");
            for (int i=a; i>=b; i--){
                System.out.println(i);
            }
            System.out.println("while loop: ");
            while (a>=b){
                System.out.println(a);
                a--;
            }
        }
    }
}
