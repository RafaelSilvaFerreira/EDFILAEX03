package View;

import java.util.Scanner;

import Controller.ImpressoraController;
import Model.Fila;


public class Principal {
	//usando JOptionPane que permita ao usuário inserir números e consultar as chamadas perdidas. 
	public static void main(String args[]) {
		Fila documentos = new Fila();
		Scanner input = new Scanner(System.in);
		
		System.out.println("escolha uma das opções:"
				+ "/n 1- adicionar um documento"
				+ "/n 2- imprimir um documento"
				+ "/n 9- fechar programa");
		
	
		boolean rodando=true;
		
		while (rodando) {
			switch (input.nextInt()) {
			case 1:
				ImpressoraController.insereDocumento(documentos, input.next());
				break;
			case 2:
				ImpressoraController.imprime(documentos);
				break;

			case 9:
				rodando=false;
				break;
				
			default:
				System.err.println("opção inválida");
			}
		}
		input.close();
	}
}
