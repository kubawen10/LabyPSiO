package lab6.zadanie;

public class Samochod extends Pojazd implements Tankowalny{
    public Samochod(){
        super(new String[]{"Silnik", "Zderzak"});
    }

    @Override
    public void zatankuj(){
        System.out.println("Za 20 zl poprosze!");
    }
}
