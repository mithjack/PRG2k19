package Fraccion;
import java.util.*;
public class Main {
public static void main(String[]Args) {
	int num, den, num2, den2;
	Scanner sc=new Scanner(System.in);
	boolean int1=false;
	while(!int1) {
	System.out.println("Elige opcion:");
	System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n0. Salir");
	int sw1=sc.nextInt();
	
	switch(sw1) {
		case 0:
			int1=true;
			break;
		case 1:
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num=sc.nextInt();
			System.out.println("Dame denominador");
			den=sc.nextInt();
			Fraccion a1=new Fraccion(num,den);
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num2=sc.nextInt();
			System.out.println("Dame denominador");
			den2=sc.nextInt();
			Fraccion a2=new Fraccion(num2,den2);
			Fraccion a3=new Fraccion();
			a3=a1.Suma(a2);
			a3.Simplificar();
			a3.Muestra();
			break;
			
		case 2:
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num=sc.nextInt();
			System.out.println("Dame denominador");
			den=sc.nextInt();
			Fraccion b1=new Fraccion(num,den);
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num2=sc.nextInt();
			System.out.println("Dame denominador");
			den2=sc.nextInt();
			Fraccion b2=new Fraccion(num2,den2);
			Fraccion b3=new Fraccion();
			b3=b1.Resta(b2);
			b3.Simplificar();
			b3.Muestra();
			break;
			
		case 3:
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num=sc.nextInt();
			System.out.println("Dame denominador");
			den=sc.nextInt();
			Fraccion c1=new Fraccion(num,den);
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num2=sc.nextInt();
			System.out.println("Dame denominador");
			den2=sc.nextInt();
			Fraccion c2=new Fraccion(num2,den2);
			Fraccion c3=new Fraccion();
			c3=c1.Multi(c2);
			c3.Simplificar();
			c3.Muestra();
			break;
			
		case 4:
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num=sc.nextInt();
			System.out.println("Dame denominador");
			den=sc.nextInt();
			Fraccion d1=new Fraccion(num,den);
			System.out.println("1a Fraccion");
			System.out.println("Dame numerador");
			num2=sc.nextInt();
			System.out.println("Dame denominador");
			den2=sc.nextInt();
			Fraccion d2=new Fraccion(num2,den2);
			Fraccion d3=new Fraccion();
			d3=d1.Divi(d2);
			d3.Simplificar();
			d3.Muestra();
			break;
			
		default:
			break;
	}	
	}
	sc.close();
}
}
