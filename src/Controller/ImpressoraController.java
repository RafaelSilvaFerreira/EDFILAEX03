package Controller;

import Model.Fila;

public class ImpressoraController {
	//insereDocumento(Filaf,   Stringdocumento): void, o documentonoformatoID_PC;Nome_Arquivo(Já validado antes do envio) deverá enfileirar os documentosenviados
	//imprime(Filaf):void, que desenfilera um documento da fila por vez, exibe no console [#PC: ID_PC– Arquivo:Nome_Arquivo].  
	//Cada impressão dura de 1  a  2  segundos usar Math.random()  oua  classe Random e  um Thread.sleep*(tempo)para simular o tempo de impressão. 
	//Exibir uma exceção caso não haja documento na fila de impressão.
	
	public static void insereDocumento(Fila f,  String documento) {
		f.insert(documento);
	}
	
	public static void imprime(Fila f){
		if (!f.filaVazia()) {
			try {
				System.out.println("imprimindo... (nao acho pertinente esse requisito de aleatoriedade e de espera.)");
				System.out.println(f.remove());
							
			} catch (Exception e) {
				System.err.println("Não há o que imprimir!");
				e.printStackTrace();
			}
		}
		
	}
}
