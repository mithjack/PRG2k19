package Geometria;

public class Circulo {
	private Punto centro = null;
	//private String nombre ;
	private double radio = 0;
	public Circulo(Punto param1, double param2)
	{
	centro = param1;
	radio = param2;
	}
	public void muestra()
	{
	System.out.print("Centro circulo= " );
	centro.muestra();
	//System.out.println(“Centro circulo= (“ + centro.getX()+”,”+ centro.getY()+ ”)”);
	System.out.println("radio= " + radio);
	}
}
