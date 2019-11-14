package clas1;

public class Punto
{
    private double x=0;
    private double y=0;
    public Punto (double param1, double param2){
        x=param1;
        y=param2;
    }
    public void muestra(){
        System.out.println("("+x+", "+y+")");
    }
}
