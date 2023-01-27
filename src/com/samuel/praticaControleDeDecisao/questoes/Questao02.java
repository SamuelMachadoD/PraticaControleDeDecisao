package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/* 2. Faça um Programa que peça um valor e mostre na tela se o valor é 
positivo ou negativo */
public class Questao02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um valor : ");
		double valor = scan.nextDouble();
		if ( valor >= 0 ) {
			System.out.println("Valor positivo!");
		} else {
			System.out.println("Valor negativo!");
		}
	}

}
