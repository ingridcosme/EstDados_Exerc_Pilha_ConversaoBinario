/*
 * Implementar um novo projeto Java com base biblioteca PilhaInt que permita a 
 * convers�o de decimais para bin�rios, a qual se d� dividindo, sucessivamente,
 * o valor de entrada por 2 e concatenando os restos da divis�o do �ltimo para o
 * primeiro. O projeto deve ter uma classe ConverteController no package 
 * controller, que inicialize uma pilha de inteiros e com um m�todo 
 * decToBin(intdecimal):String, que, recebendo um n�mero decimal e realizando as
 * opera��es, ir� inserindo os restos das divis�es na pilha. Ao t�rmino do 
 * empilhamento, dever� ser feita a opera��o de desempilhar, concatenando cada
 * n�mero desempilhado (Convertendo para String) com o pr�ximo, at� a pilha 
 * esvaziar. Deve-se ter tamb�m uma classe Principal no package view que permita
 * ao usu�rio inserir um n�mero decimal.
 */

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
