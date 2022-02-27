package lab5.zadanie;

public class WlaczanyDlugopis extends Dlugopis {
    protected boolean czyWlaczony;

    public WlaczanyDlugopis(boolean czyWlaczony){
        this.czyWlaczony=czyWlaczony;
    }

    public void setCzyWlaczony(boolean czyWlaczony){
        this.czyWlaczony=czyWlaczony;
    }

    @Override
    public void napis(String n){
        if (czyWlaczony){
            super.napis(n);
        }
    }
}
