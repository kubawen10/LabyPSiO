package lab4.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Departament {
    private String nazwa;
    //agregacja studenta
    List<Student> students = new ArrayList<>();

    public Departament(String nazwa){
        this.nazwa=nazwa;
    }

    public void addStudent(Student s){
        s.setDepartament(nazwa);
        students.add(s);
    }

    //asociacja departament i wykladowca
    public Lecturer znajdz(String imie){
        return new Lecturer(imie, nazwa);
    }
}
