package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*16.Faça um programa que calcule as raízes de uma equação do segundo 
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, 
b e c e fazer as consistências, informando ao usuário nas seguintes 
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é 
do segundo grau e o programa não deve fazer pedir os demais 
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes 
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas 
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais; 
informe-as ao usuário; */
public class Questao16 {

	public static void main(String[] args) {
		double a, b, c, delta, baskhara = 0;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor de a: ");
		a = scan.nextDouble();
		
		if(a != 0) {
			System.out.println("Digite o valor de b: ");
			b = scan.nextDouble();
			System.out.println("Digite o valor de c: ");
			c = scan.nextDouble();
			
			delta = Math.pow(b, 2) - 4 * a * c;
			
			
			if(delta < 0) {
				System.out.println("A equacao nao possui raizes reais! Programa encerrado!");
			}else if(delta == 0) {
				System.out.println("A equacao possui apenas 1 raiz real!");
				baskhara = (-b + Math.sqrt(delta))/2*a;
				System.out.println(baskhara);
			}else {
				System.out.println("A equacao possui 2 raizes reais!");
				baskhara = (-b + Math.sqrt(delta))/2*a;
				System.out.println("Bhaskara postivo " + baskhara);
				baskhara = (-b - Math.sqrt(delta))/2*a;
				System.out.println("Bhaskara negativo " + baskhara);
			}
			
		}else {
			System.out.println("Nao e uma equacao de segundo grau! Programa encerrado!");
		}
		
	}

}
