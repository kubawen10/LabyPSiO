package lab4.zadanie;
public class Main {
    public static void main(String[] args) {
        University u = new University();
        Student s1 = new Student("Kuba");

        Departament d1 = u.addDepartament("WIT");
        d1.addStudent(s1);

        Lecturer zbigniew = d1.znajdz("Zbigniew");
        zbigniew.dajOcene(5,s1);
    }
}
