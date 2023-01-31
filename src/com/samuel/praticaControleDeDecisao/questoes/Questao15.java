package com.samuel.praticaControleDeDecisao.questoes;

import java.util.Scanner;

/*15.Faça um Programa que peça os 3 lados de um triângulo. O programa 
deverá informar se os valores podem ser um triângulo. Indique, caso 
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer 
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes; */
public class Questao15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Lado 1 do triangulo: ");
		double lado1 = scan.nextDouble();
		System.out.println("Lado 2 do triangulo: ");
		double lado2 = scan.nextDouble();
		System.out.println("Lado 3 do triangulo: ");
		double lado3 = scan.nextDouble();
		
		if(lado1 + lado2 >= lado3 || lado3 + lado2 >= lado1 || lado3 + lado1 >= lado2){
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triangulo Equilatero");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isoceles");
			}else {
				System.out.println("Triangulo Escaleno");
			}
		}else {
			System.out.println("Nao e um triangulo");
		}

	}

}
