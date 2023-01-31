package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*14.Faça um programa que lê as duas notas parciais obtidas por um aluno 
numa disciplina ao longo de um semestre, e calcule a sua média. A 
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito 
o Entre 9.0 e 10.0 A 
o Entre 7.5 e 9.0 B 
o Entre 6.0 e 7.5 C 
o Entre 4.0 e 6.0 D 
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito 
correspondente e a mensagem “APROVADO” se o conceito for 
A, B ou C ou “REPROVADO” se o conceito for D ou E */
public class Questao14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite sua nota do 1 semestre: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite sua nota do 2 semestre: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		String conceito = null;
		
		if(media >= 9.0 && media <= 10) {
			conceito = "A";
		}else if(media >= 7.5 && media <= 9.0) {
			conceito = "B";
		}else if(media >= 6.0 && media <= 7.5) {
			conceito = "C";
		}else if(media >= 4.0 && media <= 6.0) {
			conceito = "D";
		}else if(media >= 0.0 && media <= 4.0) {
			conceito = "E";
		}
		
		System.out.println("BOLETIM");
		System.out.println("------------------");
		System.out.println("Primeiro Semestre : "+ nota1);
		System.out.println("Segundo Semestre: "+ nota2);
		System.out.println("Media do ano: "+ media +" - Conceito : "+conceito);
		System.out.println("------------------");
		
		switch(conceito) {
			case "A":
			case "B":
			case "C": System.out.println("Resultado : APROVADO"); break;
			default: System.out.println("Resultado: REPROVADO"); break;	
		}
	}

}
