package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*7. Faça um Programa que leia três números e mostre o maior e o menor 
deles */
public class Questao07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite 3 numeros, separando pressionando Enter: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		if(numero1 > numero2 && numero1 > numero3) {
			if(numero2 > numero3) {
				System.out.println("O maior é " + numero1);
				System.out.println("O menor é " + numero3);
			}else {
				System.out.println("O maior é " + numero1);
				System.out.println("O menor é " + numero2);
			}
		}else if(numero2 > numero1 && numero2 > numero3) {
			if(numero1 > numero3) {
				System.out.println("O maior é " + numero2);
				System.out.println("O menor é " + numero3);
			}else {
				System.out.println("O maior é " + numero2);
				System.out.println("O menor é " + numero1);
			}
		}else {
			if(numero1 > numero2) {
				System.out.println("O maior é " + numero3);
				System.out.println("O menor é " + numero2);
			}else {
				System.out.println("O maior é " + numero3);
				System.out.println("O menor é " + numero1);
			}
		}
	}

}
