package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

//1. Faça um Programa que peça dois números e imprima o maior deles.
public class Questao01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite outro numero: ");
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println(numero1);
		}else {
			System.out.println(numero2);
		}

	}

}
