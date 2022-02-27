package lab5.zadanie;

public class KolorowyDlugopis extends WlaczanyDlugopis{
    protected String [] kolory={"czerwony", "zielony", "niebieski", "czarny"};
    protected String kolor;

    public KolorowyDlugopis(boolean czyWlaczony){
        super(czyWlaczony);
        kolor=kolory[0];
    }

    private boolean czyPosiadaKolor(String kolor){
        for(String k: kolory){
            if(k.equals(kolor)) return true;
        }
        return false;
    }

    public void setKolor(String kolor){
        if (czyPosiadaKolor(kolor)){
            this.kolor=kolor;
        }
    }

    @Override
    public void napis(String n){
        System.out.println("<"+kolor+">"+n+"</"+kolor+">");
    }
}
