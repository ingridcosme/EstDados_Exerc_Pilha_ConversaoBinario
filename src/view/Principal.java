/*
 * Implementar um novo projeto Java com base biblioteca PilhaInt que permita a 
 * conversão de decimais para binários, a qual se dá dividindo, sucessivamente,
 * o valor de entrada por 2 e concatenando os restos da divisão do último para o
 * primeiro. O projeto deve ter uma classe ConverteController no package 
 * controller, que inicialize uma pilha de inteiros e com um método 
 * decToBin(intdecimal):String, que, recebendo um número decimal e realizando as
 * operações, irá inserindo os restos das divisões na pilha. Ao término do 
 * empilhamento, deverá ser feita a operação de desempilhar, concatenando cada
 * número desempilhado (Convertendo para String) com o próximo, até a pilha 
 * esvaziar. Deve-se ter também uma classe Principal no package view que permita
 * ao usuário inserir um número decimal.
 */

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
