package ej6;
import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double peso=0;
	String unidad="a";
	boolean sw1=false;
	while(!sw1) {
	System.out.println("Introduce un peso");
	peso=sc.nextDouble();
	System.out.println("Dime su unidad:\nLb, Li, Oz, P, K, G, Q");
	unidad=sc.next();
	switch(unidad) {
	case "Lb":case "Li":case "Oz":case "P":case "K":case "G":case "Q":
		sw1=true;
		break;
	default:
		System.out.println("Unidad no valida");
		break;
	}
	}
	Peso a=new Peso(peso,unidad);
	boolean sw2=false;
	while(!sw2) {
	System.out.println("");
	System.out.println("Actualmente "+a.mPeso()+a.mUnidad());
	System.out.println("Que quieres hacer?");
	System.out.println("1. Pasar a Libras");
	System.out.println("2. Pasar a Lingotes");
	System.out.println("3. Pasar a otra unidad\nLb, Li, Oz, P, K, G, Q");
	int men=sc.nextInt();
	switch(men) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	default:
		System.out.println("Opcion invalida");
		break;
	}
	}
	sc.close();
}
}
