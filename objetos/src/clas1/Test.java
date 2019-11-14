package clas1;

public class Test
{
    public static void main(String[] args){
    Punto pun = new Punto(2,2);
    Circulo circulo1=new Circulo();
    Circulo circulo2=new Circulo(pun, 3);
    circulo1.muestra();
    circulo2.muestra();
    pun=null;
    }
}