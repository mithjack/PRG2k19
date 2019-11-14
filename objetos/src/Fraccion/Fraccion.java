package Fraccion;

public class Fraccion {
private int Numerador;
private int Denominador;

public Fraccion() {
	Numerador=1;
	Denominador=1;
}

public Fraccion (int n, int d) {
	Numerador=n;
	Denominador=d;
}




/*
//No usar
public void Suma(int n1, int n2, int d1, int d2) {
	Numerador=n1*d2+n2*d1;
	Denominador=d1+d2;
	System.out.println(Numerador+"/"+Denominador);	
}


public void Suma(Fraccion a1, Fraccion a2) {
	Numerador=a1.Numerador*a2.Denominador+a2.Numerador*a1.Denominador;
	Denominador=a1.Denominador+a2.Denominador;
	System.out.println(Numerador+"/"+Denominador);	
}
//*/

public Fraccion Suma (Fraccion a2) {

	int num=Numerador*a2.Denominador+a2.Numerador*Denominador;
	int den=Denominador+a2.Denominador;
	
	return new Fraccion(num,den);	
	
}

public Fraccion Resta(Fraccion b2) {
	int num=Numerador*b2.Denominador-b2.Numerador*Denominador;
	int den=Denominador*b2.Denominador;
	return new Fraccion(num,den);
		
}

public Fraccion Multi(Fraccion c2) {
	int num=Numerador*c2.Numerador;
	int den=Denominador*c2.Denominador;
	return new Fraccion(num,den);
}

public Fraccion Divi(Fraccion d2) {
	int num=Numerador*d2.Denominador;
	int den=Denominador*d2.Numerador;
	return new Fraccion(num,den);
}


public void Muestra() {
	System.out.println();
	System.out.println("Resultado: "+Numerador+"/"+Denominador);
	System.out.println();
}

public void Valor() {
	
}

void Simplificar() {

if(Numerador%2==0) {
	Numerador/=2;
	Denominador/=2;}
else if(Numerador %3==0) {
	Numerador/=3;
	Denominador/=3;}
else if(Numerador==Denominador) {
	Numerador=1;
	Denominador=1;
}

}



private void McD() {
	
}

}
