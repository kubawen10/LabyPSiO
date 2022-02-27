package lab4.zadanie;

import java.util.ArrayList;
import java.util.List;

public class University {
    //agregacja departament w uniwersytecie
    List<Departament> departaments = new ArrayList<>();
    //agregacja wykladowcy w uniwersytecie
    List<Lecturer> lecturers = new ArrayList<>();

    public Departament addDepartament(String nazwa){
        Departament d = new Departament(nazwa);
        departaments.add(d);
        return d;
    }


    public void zatrudnij(Lecturer l){
        lecturers.add(l);
    }
}
