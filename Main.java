package lab3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Agenda agenda= new Agenda("agenda");
		Scanner sc = new Scanner(System.in);
		String option;
		String menu = 
				"(C)adastrar Contato"
				+ "\n"
				+ "(L)istar Contatos"
				+ "\n"
				+ "(E)xibir Contato"
				+ "\n"
				+ "(S)air"
				+ "\n"
				+ "Opção> ";
		
		do {
			System.out.print(menu);
			 option = sc.nextLine();
			 
			switch (option) {
			case "c":
				int pos;
				String nome;
				String sobrenome;
				String telefone;
				
				System.out.print("\nPosição: ");
				pos = sc.nextInt();
				
				if (pos > 100 || pos < 1) {
					System.out.println("POSIÇÃO INVÁLIDA!\n");
					break;
				}
				
				System.out.print("\nNome: ");
				nome = sc.nextLine();
				
				System.out.print("\nSobrenome: ");
				sobrenome = sc.nextLine();
				
				System.out.print("\nTelefone: ");
				telefone = sc.nextLine();
				
				agenda.cadastraContato(pos, nome, sobrenome, telefone);
				System.out.println("CADASTRO REALIZADO!\n");
				
				
				break;
			case "l":
				System.out.print(agenda.listaContatos());
				break;
			case "e":
				System.out.print("\nPosição: ");
				pos = sc.nextInt();
				if (agenda.contatoNulo(pos)|| pos > 100 || pos < 1){
					System.out.println("POSIÇÃO INVÁLIDA!\n");
					break;
				}
				System.out.println(agenda.exibeContato(pos));
			case "s" :
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!\n");
				break;
			}
		} while (!option.equals("s"));
	}
}