package lab3;

import java.util.Scanner;

public class Agenda {
	private Contato[] agenda = new Contato[100];
	
	public static void main(String[] args) {
		do {
			System.out.println("Cadastrar contato: (C)");
			System.out.println("Listar contatos: (L)");
			System.out.println("Exibir contato: (E)");
			System.out.println("Sair: (S)");
			Scanner sc = new Scanner(System.in);
			System.out.println("");
			System.out.print("Escolha uma opção: ");
			String opcao = sc.nextLine();

			switch (opcao){
				case "c":
					System.out.print("Posição: ");
					
					break;
				case "l":
					break;
				case "e":
					break;
			}
		} while (opcao != "s");
		}
		
