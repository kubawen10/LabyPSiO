package lab5.przygotowanie.zad2Wyklad;

public class Wykladowca {
    private final String nazwisko;
    private Wyklad [] wyklady;

    public Wykladowca(String nazwisko){
        this.nazwisko = nazwisko;
    }

//kod powielony, jak mooglbym to ominac
    public void przydzielWyklad(Wyklad nowyWyklad) {
        //dodaje nowy wyklad do listy wyklady, ktore prowadzi wykladowca
        int nowaIlosc = (wyklady == null ? 1 : wyklady.length+1);
        Wyklad [] nowaLista = new Wyklad[nowaIlosc];

        for(int i=0;i<nowaIlosc-1;i++){
            nowaLista[i] = wyklady[i];
        }
        nowaLista[nowaIlosc-1] = nowyWyklad;

        wyklady=null;
        wyklady=nowaLista;
    }

    public Wyklad[] getWyklady() {
        return wyklady;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    private void przestanProwadzicWyklad(int i){
        if(wyklady.length==1){
            wyklady=null;
        }else{
            Wyklad [] nowaLista = new Wyklad[wyklady.length-1];
            for(int j=0;j<i;j++){
                nowaLista[j]=wyklady[j];
            }

            for(int j=i+1;j<wyklady.length;j++){
                nowaLista[j-1]=wyklady[j];
            }
        }
    }
    public void przeprowadzWyklad(Wyklad w){
        for (int i=0;i<wyklady.length;i++){
            if (w==wyklady[i]){
                int a = w.przeprowadz();
                if(a==0){
                    przestanProwadzicWyklad(i);
                }
            }
        }
    }
}
