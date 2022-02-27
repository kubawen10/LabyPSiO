package lab6.zadanie;

public class Warsztat {
    public static void napraw(Pojazd p){
        if(p.czyZepsuty){
            p.czyZepsuty=false;
        }
    }

    public static void diagnoza(Pojazd p){
        if (p.czyZepsuty){
            System.out.println("Pojazd jest zepsuty!");
            System.out.print("Czesci potrzebne do naprawy: ");
            for (int i=0;i<p.czesci.length;i++){
                System.out.print(p.czesci[i]+ " ");
            }
            System.out.println();
        }
    }
}
