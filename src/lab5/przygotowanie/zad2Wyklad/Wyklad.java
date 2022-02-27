package lab5.przygotowanie.zad2Wyklad;

public class Wyklad {
    private String [] daty;
    private boolean czyZakonczony = false;

//konstruktor domyslny nie powinien byc zrobiony? Bo bez sensu nie znac nazwy i dat
    public Wyklad(String [] daty){
        this.daty = daty;
    }

    public String[] getDaty() {
        return daty;
    }

    public void setDaty(String[] daty) {
        this.daty = daty;
    }

    public int przeprowadz(){
        if(daty.length==1){
            daty=null;
            czyZakonczony=true;
            return 0;
        }
        String [] noweDaty = new String[daty.length-1];
        for (int i=1;i<daty.length;i++){
            noweDaty[i-1]=daty[i];
        }
        return 1;
    }
}
