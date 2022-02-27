package lab4.zadanie;

public class Lecturer {
    String imie;
    String wydzial;
    public Lecturer(String i, String w){
        imie=i;
        wydzial=w;
    }
    public void uczy(Departament d){
        System.out.println("bardzo ucze");
    }

    public void dajOcene(int ocena, Student student){
        student.dodajOcene(ocena);
    }
}
