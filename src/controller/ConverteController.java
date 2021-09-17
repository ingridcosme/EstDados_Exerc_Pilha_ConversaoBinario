/*
 * ImplementarumnovoprojetoJavacombasebibliotecaPilhaIntquepermitaaconvers�odedecimaisparabin�rios,aqualsed�dividindo,sucessivamente,ovalordeentradapor2econcatenandoosrestosdadivis�odo�ltimoparaoprimeiro.
OprojetodeveterumaclasseConverteControllernopackagecontroller,queinicializeumapilhadeinteirosecomumm�tododecToBin(intdecimal):String,que,recebendoumn�merodecimalerealizandoasopera��es,ir�inserindoosrestosdasdivis�esnapilha.Aot�rminodoempilhamento,dever�serfeitaaopera��odedesempilhar,concatenandocadan�merodesempilhado(ConvertendoparaString)comopr�ximo,at�apilhaesvaziar.
Deve-setertamb�mumaclassePrincipalnopackageviewquepermitaaousu�rioinserirumn�merodecimal
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
