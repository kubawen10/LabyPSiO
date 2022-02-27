package lab2.zadanie;

public class KoxKlasa {
    public static void main(String[] args) {
        new KoxKlasa().run();
    }

    public void run() {
        zadanie1();
        zadanie2();
        zadanie3();
    }

    public void zadanie1() {
        System.out.println("Zadanie 1: ");
        long x = 4;
        long wynik = 1;
        long wykladnik = 3;
        for (int i = 0; i < wykladnik; i++) {
            wynik = wynik * x;
        }
        System.out.println(x + "^" + wykladnik + "=" + wynik);
    }

    public long silnia(long a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * silnia(a - 1);
        }
    }

    public void zadanie2() {
        System.out.println("Zadanie 2: ");
        long x = 5;
        System.out.println(x + "! = " + silnia(x));
    }

    public void zadanie3() {
        System.out.println("Zadanie 3: ");
        double N = 27;
        double EPS = 0.000000001;
        double xi;
        double xi_1;
        if (N > 1) {
            xi = N / 3;
        } else {
            xi = N;
        }

        while (Math.abs(xi * xi * xi - N) > EPS * Math.abs(N)) {
            xi_1 = xi + ((N / (xi * xi) - xi) / 3);
            xi = xi_1;
        }
        System.out.println(xi);


    }

}
