package lab5.przygotowanie.zad2Wyklad;

public class Student {
    private Wyklad [] wyklady;

//dodaje nowy wyklad do listy wyklady, na ktore chodzi student
    public void zapiszNaWyklad(Wyklad nowyWyklad) {

        int nowaIlosc = (wyklady == null ? 1 : wyklady.length+1);
        Wyklad [] nowaLista = new Wyklad[nowaIlosc];

        for(int i=0;i<nowaIlosc-1;i++){
            nowaLista[i] = wyklady[i];
        }
        nowaLista[nowaIlosc-1] = nowyWyklad;

        wyklady=null;
        wyklady=nowaLista;
    }

    public void wezKonsultacje(Wykladowca wykladowca){//mozna to rozbudowac czy student chodzi na wyklad czy wykladowca prowadzi wyklad itd
        System.out.println("hej gho ale super");
    }
}
