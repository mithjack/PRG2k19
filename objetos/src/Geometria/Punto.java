package Geometria;

public class Punto {
	private int x = 0;
	private int y = 0;
	public Punto(int param1, int param2)
	{
	x = param1;
	y = param2;
	}
	public void muestra()
	{
	System.out.println("("+x+","+y+")");
	}
}
