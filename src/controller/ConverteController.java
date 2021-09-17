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

package controller;

import br.edu.fateczl.ingridcosme.pilhaint.Pilha;

public class ConverteController {
	
	private Pilha pilhaInt;

	public ConverteController() {
		pilhaInt = new Pilha();
	}

	public String decToBin(int decimal) {
		String binario = "";
		
		if(decimal != 0) {
			while(decimal > 0) {
				pilhaInt.push(decimal % 2);
				decimal /= 2;
			}
			
			//Ou while(!pilhaInt.isEmpty())
			int tamanho = pilhaInt.size();
			for(int i = 0; i < tamanho; i++) {
				try {
					int digito = pilhaInt.pop();
					binario += digito;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			binario = "0";
		}
		return binario;
	}
	
}
