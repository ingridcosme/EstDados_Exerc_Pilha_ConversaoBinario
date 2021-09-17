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
