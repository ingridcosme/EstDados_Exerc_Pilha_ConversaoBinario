package view;

import java.util.Scanner;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController converte = new ConverteController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Conversor de decimal em binário\n\n");
		System.out.println("Digite um número: ");
		int decimal = ler.nextInt();
		
		String bin = converte.decToBin(decimal);
		System.out.println("\nO número decimal "+decimal+" é representado por "
				+bin+ " na base binária.");
		
		ler.close();
	}

}
