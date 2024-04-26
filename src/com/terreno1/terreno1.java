package com.terreno1;

import java.util.Locale;
import java.util.Scanner;

public class terreno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double area, valor;
			
			System.out.println("Digite a largura do terreno: ");
			double largura = sc.nextDouble();
			
			System.out.println("Digite o comprimento do terreno: ");
			double comprimento = sc.nextDouble();
			
			System.out.println("Digite o valor quadrado do terreno: ");
			double metroQuadrado = sc.nextDouble();
			
			area = largura * comprimento;
			valor = area * metroQuadrado;
			
			System.out.printf("Area do terreno: %.2f\n", area);
			System.out.printf("Preco do terreno: %.2f\n", valor);
			
				
			}

	}


