package lab6.zadanie;

public abstract class Pojazd {
    public boolean czyZepsuty;
    public String[] czesci;

    public Pojazd(String [] czesci){

        czyZepsuty = false;

        this.czesci= czesci;
    }

    public void uderzWDrzewo(){
        czyZepsuty=true;
    }

}
