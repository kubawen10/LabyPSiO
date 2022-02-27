package lab5.przygotowanie.zad2Wyklad;

public class Wydzial {
    public Wyklad stworzWyklad(String [] daty){
//przechowywac w tablicy?
        return new Wyklad(daty);
    }

    public static void main(String[] args) {
        Wydzial w = new Wydzial();

        String [] datyW1 = {"05.11.2021", "12.11.2021", "19.11.2021"};

        Wykladowca wykladowca1 = new Wykladowca("KOX");
        Student student1 = new Student();

//moge zrobic to bezposrednio a nie przez stworzWyklad wiec jak temu zapobiec
        Wyklad wyklad1 = w.stworzWyklad(datyW1);

        wykladowca1.przydzielWyklad(wyklad1);
        student1.zapiszNaWyklad(wyklad1);



//studenci zapisani na wyklad powinni byc przechowywani w tym wykladzie czy sami powinni miec liste wykladow na ktore uczeszczaja czy to i to? jak najepiej
//to samo z wykladowca

    }
}
