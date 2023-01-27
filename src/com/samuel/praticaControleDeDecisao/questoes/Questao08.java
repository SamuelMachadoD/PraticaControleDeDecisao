package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*8. Faça um programa que pergunte o preço de três produtos e informe 
qual produto você deve comprar, sabendo que a decisão é sempre 
pelo mais barato. */
public class Questao08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite 3 preços de produtos, separando pressionando Enter: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		if(numero1 < numero2 && numero1 < numero3) {
			System.out.println("Voce deve comprar o produto numero 1 de R$" + numero1);
		}else if(numero2 < numero1 && numero2 < numero3) {
			System.out.println("Voce deve comprar o produto numero 2 de R$" + numero2);
		}else {
			System.out.println("Voce deve comprar o produto numero 3 de R$" + numero3);
		}
	}

}
