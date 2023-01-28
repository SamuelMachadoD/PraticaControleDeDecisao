package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*12.Faça um programa para o cálculo de uma folha de pagamento, 
sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o 
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é 
a empresa que deposita). O Salário Líquido corresponde ao Salário 
Bruto menos os descontos. O programa deverá pedir ao usuário o 
valor da sua hora e a quantidade de horas trabalhadas no mês.

o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela 
as informações, dispostas conforme o exemplo abaixo:

No exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00 
(-) IR (5%) : R$ 55,00 
(-) INSS ( 10%) : R$ 110,00 
FGTS (11%) : R$ 121,00 
Total de descontos : R$ 165,00 
Salário Liquido : R$ 935,00
*/
public class Questao12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double salarioLiquido = 0;
		double salarioBruto = 0;
		double valorHora;
		double irPorcentagem;
		double ir;
		double inss = 10;
		double fgts = 11;
		double sindicato = 3;
		double totalDesconto;
		
		System.out.println("Digite o valor da sua hora: ");
		valorHora = scan.nextDouble();
		System.out.println("Digite quando horas vc trabalha no mes: ");
		double horasTrabalhadas = scan.nextDouble();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		if(salarioBruto <= 900) {
			irPorcentagem = 0;
		}else if(salarioBruto <= 1500) {
			irPorcentagem = 5;
		}else if(salarioBruto <= 2500) {
			irPorcentagem = 10;
		}else {
			irPorcentagem = 20;
		}
		
		ir = salarioBruto * (irPorcentagem/100);
		inss = salarioBruto * (inss/100);
		fgts = salarioBruto * (fgts/100);
		sindicato = salarioBruto * (sindicato/100);
		totalDesconto = ir + inss + sindicato;
		salarioLiquido = salarioBruto - totalDesconto;
		
		System.out.println("Salario Bruto ( " + valorHora + " * " + horasTrabalhadas + " ) : R$" + salarioBruto);
		System.out.println("(-) IR ( " + irPorcentagem + "% ) : R$" + ir);
		System.out.println("(-) INSS ( 10% ) : R$" + inss);
		System.out.println("(-) Sindicato ( 3% ) : R$" + sindicato);
		System.out.println("Total de descontos : R$" + totalDesconto);
		System.out.println("Salario Liquido : R$" + salarioLiquido);
		
	}

}
