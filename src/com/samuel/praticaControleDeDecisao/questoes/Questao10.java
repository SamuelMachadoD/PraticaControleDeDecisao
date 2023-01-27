package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*10.Faça um Programa que pergunte em que turno você estuda. Peça 
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
Inválido!", conforme o caso. */
public class Questao10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Em que turno voce estuda?( M - Matutino, V - Vespertino, N - Noturno )");
		String turno = scan.next();
		if(turno.equals("M")) {
			System.out.println("Bom dia!");
		}else if(turno.equals("V")) {
			System.out.println("Boa tarde!");
		}else if(turno.equals("N")) {
			System.out.println("Boa noite");
		}else {
			System.out.println("Valor invalido!");
		}
	}

}
