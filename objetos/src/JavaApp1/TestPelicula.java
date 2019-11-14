package JavaApp1;

public class TestPelicula {
	public static void main(String[] args){
		Pelicula peli1, peli2;
		peli1=new Pelicula("2001: Una Odisea en el Espacio","Stanley Kubrick",1968,Pelicula.CIENCIA_FICCION);
		peli2=new Pelicula("2046","Wong Kar Wai",2004,Pelicula.CIENCIA_FICCION);
		System.out.println(peli1);
		System.out.println(peli2);
		}
}
