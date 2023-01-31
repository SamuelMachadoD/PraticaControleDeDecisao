package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/* 4. Faça um Programa que verifique se uma letra digitada é vogal ou 
consoante */
public class Questao04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String letra = scan.next();
		
		/** if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
		{
			System.out.println("Vogal");
		}else {
			System.out.println("Consoante");
		}*/
		
		switch(letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": 
				System.out.println("Vogal"); 
				break;
			default: System.out.println("Consoante");
		}
		
	}

}
