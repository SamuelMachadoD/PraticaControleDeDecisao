package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*11.As Organizações Tabajara resolveram dar um aumento de salário aos 
seus colaboradores e lhe contraram para desenvolver o programa que 
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o 
reajuste segundo o seguinte critério, baseado no salário atual:

o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% 

Após o aumento ser realizado, informe na tela:

o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento. */
public class Questao11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite seu salario: ");
		double salarioAntigo = scan.nextDouble();
		double salarioNovo;
		double aumento;
		double percentual;
		
		if(salarioAntigo <= 280) {		
			percentual = 20;		
		} else if(salarioAntigo > 280 && salarioAntigo <= 700) {
			percentual = 15;	
		} else if(salarioAntigo > 700 && salarioAntigo <= 1500) {
			percentual = 10;	
		}else {
			percentual = 5;
		}
		
		aumento = salarioAntigo * (percentual/100);
		salarioNovo = salarioAntigo + aumento;
		System.out.println("Salario antes do reajuste: R$" + salarioAntigo);
		System.out.println("O percentual aplicado foi de " + percentual + "%");
		System.out.println("O aumento aplicado foi de R$" + aumento);
		System.out.println("O salario apos o reajuste: R$" + salarioNovo);
	}

}
