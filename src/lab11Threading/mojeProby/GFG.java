package lab11Threading.mojeProby;

// Java program to find the factorial
// of a number by the implementation
// of threads using thread class

class ThreadImplement extends Thread {
    static int fact = 1;

    // Overriding the run method
    // to find the factorial of
    // a number 5
    public void run()
    {

        // Loop to compute the factorial
        for (int i = 1; i <= 5; i++)
            fact = fact * i;
        System.out.println(fact);
    }
}

// Class to create a thread and
// compute the factorial
public class GFG {
    public static void main(String[] args)
    {
        // Creating an object of the
        // thread class
        Thread t1 = new ThreadImplement();

        // Computing the above class
        t1.start();
    }
}
