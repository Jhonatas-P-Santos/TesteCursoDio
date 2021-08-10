package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a,b;
		System.out.println("Digite um valor:");
		 a= scan.nextInt();
		System.out.println("Digite outro valor:");
		 b= scan.nextInt();
		 
		  int soma = soma(a,b);
		  int subs = sub(a,b);
		  int mults = mult(a,b);
		  double divs = div(a,b);
		  
		  System.out.println("Soma= " + soma +"|Subtração= "+subs + "|Multiplicação= "+mults + "|Divisão= "+divs);
		 
	}
	
	
	
	public static int soma(int a, int b) {
		return a+b;
		
	}
	
	public static int sub(int a, int b) {
		return a-b;
		
	}
	
	public static int mult(int a, int b) {
		return a*b;
		
	}
	public static double div(double a, double b) {
		return a/b;
		
	}

}
