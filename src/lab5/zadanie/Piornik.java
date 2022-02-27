package lab5.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Piornik {
    protected List<Dlugopis> dlugopisy = new ArrayList<>();

    public void wlozDlugopis(Dlugopis d){
        dlugopisy.add(d);
    }

    public void uzyjDlugopis(int i, String n){
        dlugopisy.get(i).napis(n);
    }
}
