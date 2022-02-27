package lab5.zadanie;

public class Main {
    public static void main(String[] args) {
        Piornik p = new Piornik();

        Dlugopis d2= new Dlugopis();
        d2.napis("kox");
        WlaczanyDlugopis d = new WlaczanyDlugopis(false);
        d.setCzyWlaczony(true);

        d.napis("Hej");


        KolorowyDlugopis d1 = new KolorowyDlugopis(false);
        d1.setCzyWlaczony(true);

        d1.napis("eoeo");

        p.wlozDlugopis(d);
        p.wlozDlugopis(d1);

        d1.setKolor("czarny");
        p.uzyjDlugopis(1, "Ale jazda");


    }
}
