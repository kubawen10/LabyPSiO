package lab3.zadanie;

public class Main {
    public static void main(String[] args) {
        //System.out.println(IOFileClass.WriteFile("EOEOEO", "plik.txt"));
        //System.out.println(IOFileClass.ReadFile("plik.txt"))
        Wektor w1 = new Wektor(3,4);
        Wektor w2 = new Wektor(w1);

        Wektor ww= new Wektor();
        boolean wynik= w1.writeWektor("src/lab3/zadanie/plik.txt");
        System.out.println(wynik);


    }
}
