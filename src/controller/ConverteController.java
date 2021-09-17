/*
 * ImplementarumnovoprojetoJavacombasebibliotecaPilhaIntquepermitaaconversãodedecimaisparabinários,aqualsedádividindo,sucessivamente,ovalordeentradapor2econcatenandoosrestosdadivisãodoúltimoparaoprimeiro.
OprojetodeveterumaclasseConverteControllernopackagecontroller,queinicializeumapilhadeinteirosecomummétododecToBin(intdecimal):String,que,recebendoumnúmerodecimalerealizandoasoperações,iráinserindoosrestosdasdivisõesnapilha.Aotérminodoempilhamento,deveráserfeitaaoperaçãodedesempilhar,concatenandocadanúmerodesempilhado(ConvertendoparaString)comopróximo,atéapilhaesvaziar.
Deve-setertambémumaclassePrincipalnopackageviewquepermitaaousuárioinserirumnúmerodecimal
 */

package controller;

import br.edu.imeusp.fateczl.ingridcosme.pilhaint.Pilha;

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
