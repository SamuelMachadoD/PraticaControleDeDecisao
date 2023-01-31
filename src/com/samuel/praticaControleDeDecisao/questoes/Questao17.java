package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*17.Faça um Programa que peça um número correspondente a um 
determinado ano e em seguida informe se este ano é ou não bissexto.*/
public class Questao17 {

	public static void main(String[] args) {
		int ano = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o ano: ");
		ano = scan.nextInt();
		
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }
	}

}
