package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*22.Faça um Programa que peça um número inteiro e determine se ele é 
par ou impar. Dica: utilize o operador módulo (resto da divisão). */
public class Questao22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int valor = 0;
		System.out.println("Digite um valor inteiro: ");
		valor = scan.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

}
