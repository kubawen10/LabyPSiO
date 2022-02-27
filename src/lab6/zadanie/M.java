package lab6.zadanie;

public class M {
    public static void main(String[] args) {
        Samochod s = new Samochod();
        Rower r = new Rower();

        System.out.println(s.czyZepsuty);

        s.uderzWDrzewo();
        System.out.println(s.czyZepsuty);

        Warsztat.diagnoza(s);

        Warsztat.napraw(s);
        System.out.println(s.czyZepsuty);

        s.zatankuj();
        StacjaPaliw.uzupelnij(s);



    }
}
