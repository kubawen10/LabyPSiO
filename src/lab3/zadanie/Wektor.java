package lab3.zadanie;

public class Wektor {
    private double x;
    private double y;

    //default constructor method, sets x and y to 0
    public Wektor() {
    }

    //constructor method with x, y parameters
    public Wektor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //allows copying vectors
    public Wektor(Wektor w){
        x=w.x;
        y=w.y;
    }

    //getter methods
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    //setter method
    public void setX(double x){
        this.x=x;
    }

    //return length of vector
    public double length(){
        return Math.sqrt(x*x+y*y);
    }

    //return a unit vector
    public Wektor unitVector(Wektor wektor){
        double len= wektor.length();
        return new Wektor(wektor.getX()/len, wektor.getY()/len);
    }

    //adding vector
    public Wektor add(Wektor other){
        return new Wektor(this.x + other.getX(), this.y+ other.getY());
    }

    public String toString(){
        return "["+x+", "+y+"]";
    }


    static Wektor readWektor(String path){
        String w = IOFileClass.ReadFile(path);
        String [] parts = w.split(";");
        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);
        return new Wektor(x,y);
    }

    public boolean writeWektor(String path){
        String output = x+";"+y;
        return IOFileClass.WriteFile(output, path);
    }

}



