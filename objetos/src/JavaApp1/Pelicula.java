/**
 * @Autor: Alejandro Javier López Monzón
 * @Fecha: 12/11/2019
 * @Descripcion: La app nos crea la estructura de una futura base de datos 
 * para almacenar peliculas, introduciendo el Genero, Titulo, Autor, Nombre 
 * y un ID que nos asignara automaticamente para no repetirlo.
 */
package JavaApp1;
public class Pelicula {
private String titulo ;
private String director ;
private int anyo;
//Codigos
private int codigo; //Codigo pelicula
private static int proximoCodigo=0; //Codigo a asignar a codigo

//Generos
private int genero;
public final static int TERROR=0, CIENCIA_FICCION=1, ACCION=2, SUSPENSE=3, COMEDIA=4;


//Constructor
/**
* Constructor de Pelicula
* @param titulo Titulo de la pelicula .
* @param director Nombre del director.
* @param anyo Anyo de produccion.
* @param genero Genero de la pelicula.
*/
public Pelicula (String titulo , String director , int anyo, int genero) {
this.titulo=titulo ;
this.director=director ;
this.anyo=anyo;
this.genero=genero;
codigo=proximoCodigo;
proximoCodigo++;
}


//Args
/**
* Devuelve el anyo de produccion de la pelicula.
* @return Anyo de produccion de la pelicula.
*/
public int getAnyo() {
return anyo;
}
/**
* Asigna el anyo de produccion de la pelicula .
* @param anyo Anyo de produccion de la pelicula.
*/
public void setAnyo(int anyo) {
this.anyo = anyo;
}
/**
* Obtiene el nombre del director de la pelicula .
* @return Nombre del director de la pelicula .
*/
public String getDirector () {
return director ;
}
/**
* Asigna el nombre del director de la pelicula .
* @param director Nombre del director de la pelicula.
*/
public void setDirector (String director ) {
this.director = director ;
}
/**
* Obtiene el titulo de la pelicula .
* @return Titulo de la pelicula .
*/
public String getTitulo () {
return titulo ;
}
/**
* Asigna el titulo de la pelicula .
* @param titulo Titulo de la pelicula .
*/
public void setTitulo (String titulo ) {
	this.titulo = titulo ;
	 }
/*
* Devuelve un entero con el codigo de la pelicula
* @return El entero correspondiente
*/
public int getCodigo() {
return codigo;
}


//Genero
/**
* Devuelve una cadena que contiene el genero de la pelicula
* @return La cadena
*/
public String getGeneroComoCadena(){
return generos[genero];
}

/**
* Devuelve un entero con el codigo del genero de la pelicula
* @return El entero correspondiente
*/
public int getGenero(){
return genero;
}
/**
* Asigna el genero a la pelicula
* @param genero
**/
public void setGenero(int genero) {
this.genero=genero;
}


/**
//Opcion 1 Switch
public String toString (){
String cadenaGenero="";
	switch (genero){
	case 0: cadenaGenero="Terror";break;
	case 1: cadenaGenero="Ciencia ficcion";break;
	case 2: cadenaGenero="Accion";break;
	case 3: cadenaGenero="Suspense";break;
	case 4: cadenaGenero="Comedia"; break;
	}
return "Codigo:"+codigo+"\n"+"Pelicula: "+ titulo +"\n"+"Director : "+director+
" \n"+"Anyo: "+anyo+"\n"+"Genero: "+cadenaGenero+"\n";
}**/


//Opcion 2 String
private static final String[]generos={
"Terror","Ciencia ficcion ","Accion","Suspense","Comedia"};

public String toString (){
return "Codigo:"+codigo+"\n"+"Pelicula: "+titulo +"\n"+"Director : "+director+
		"\n"+"Anyo: "+anyo+"\n"+"Genero String: "+generos[genero]+"\n"/**+"Genero: "+genero+"\n"**/; 
//Lo comentado es el id numerico del genero, el cual con el switch nos traduce al genero
}

//Puede hacerse aqui o en el TestPelicula
/**
public static void main(String[] args){
Pelicula peli1, peli2;
peli1=new Pelicula("2001: Una Odisea en el Espacio","Stanley Kubrick",1968,Pelicula.CIENCIA_FICCION);
peli2=new Pelicula("2046","Wong Kar Wai",2004,Pelicula.CIENCIA_FICCION);
System.out.println(peli1);
System.out.println(peli2);
}
**/


}
