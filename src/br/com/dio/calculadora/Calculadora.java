package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Dige o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = (int) multiplicacao(a,b);
		int divisao = divisao(a,b);
		
		System.out.println("Soma " + soma);
		System.out.println("Subtracao " + subtracao);
		System.out.println("Div " + divisao);
		System.out.println("Mult " + multiplicacao);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(float a, float b) {
		return (int) (a / b);
	}
	
	public static float multiplicacao(int a, int b) {
		return a * b;
	}

}
