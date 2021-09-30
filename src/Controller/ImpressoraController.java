package Controller;

import Model.Fila;

public class ImpressoraController {
	//insereDocumento(Filaf,   Stringdocumento): void, o documentonoformatoID_PC;Nome_Arquivo(J� validado antes do envio) dever� enfileirar os documentosenviados
	//imprime(Filaf):void, que desenfilera um documento da fila por vez, exibe no console [#PC: ID_PC� Arquivo:Nome_Arquivo].  
	//Cada impress�o dura de 1  a  2  segundos usar Math.random()  oua  classe Random e  um Thread.sleep*(tempo)para simular o tempo de impress�o. 
	//Exibir uma exce��o caso n�o haja documento na fila de impress�o.
	
	public static void insereDocumento(Fila f,  String documento) {
		f.insert(documento);
	}
	
	public static void imprime(Fila f){
		if (!f.filaVazia()) {
			try {
				System.out.println("imprimindo... (nao acho pertinente esse requisito de aleatoriedade e de espera.)");
				System.out.println(f.remove());
							
			} catch (Exception e) {
				System.err.println("N�o h� o que imprimir!");
				e.printStackTrace();
			}
		}
		
	}
}
