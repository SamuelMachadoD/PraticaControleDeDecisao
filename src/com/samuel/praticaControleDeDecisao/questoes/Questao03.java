package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/* 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */
public class Questao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		String letra = scan.next();
		if(letra.equals("F") || letra.equals("f")) {
			System.out.println("F - Feminino");
		}else if(letra.equals("M") || letra.equals("m")) {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Sexo inválido");
		}
	}

}
