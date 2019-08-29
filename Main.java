package lab3;

import java.util.Scanner;

public class Main {
	public Agenda agenda1;
	
	public Main() {
		this.agenda1 = new Agenda("agenda1");
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String option;
		String menu = 
				"\n"
				+ "(C)adastrar contato"
				+ "\n"
				+ "(L)istar contatos"
				+ "\n"
				+ "(E)xibir contato"
				+ "\n"
				+ "(S)air"
				+ "\n"
				+ "Escolha uma opção > ";
		
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
				System.out.print("\nSobrenome: ");
				nome = sc.nextLine();
				System.out.print("\nTelefone: ");
				telefone = sc.nextLine();
				
				
				
				break;
			case "l":
				System.out.println(agenda1.listaContatos());
				break;
			case "e":
				System.out.println(agenda1.exibeContato());
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (!option.equals("s"));
	}
}
