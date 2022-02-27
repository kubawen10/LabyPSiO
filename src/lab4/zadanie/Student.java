package lab4.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String imie;
    String departament;
    List<Integer> oceny = new ArrayList<>();

    public Student(String imie){
        this.imie=imie;
    }

    public void setDepartament(String d){
        departament=d;
    }

    public void dodajOcene(int ocena){
        oceny.add(ocena);
    }

}
