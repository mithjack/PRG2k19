package clas1;

public class Circulo
{
   private Punto centro = null;
   private double radio = 0;
   public Circulo(){
       centro=new Punto(0, 0);
       radio=1;
    }
   public Circulo(Punto param1, double param2){
       centro=param1;
       radio=param2;
    }
   public void muestra(){
   System.out.print("centro= ");
   centro.muestra();
   System.out.println("radio= "+radio);
    }
}
