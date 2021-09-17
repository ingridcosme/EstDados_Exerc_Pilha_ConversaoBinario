package view;

import java.util.Scanner;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController converte = new ConverteController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Conversor de decimal em bin�rio\n\n");
		System.out.println("Digite um n�mero: ");
		int decimal = ler.nextInt();
		
		String bin = converte.decToBin(decimal);
		System.out.println("\nO n�mero decimal "+decimal+" � representado por "
				+bin+ " na base bin�ria.");
		
		ler.close();
	}

}
