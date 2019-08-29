package lab3;

public class Agenda {
	String nome;
	private Contato[] agenda;
	
	public Agenda(String nome) {
		this.agenda = new Contato[100];
		this.nome = nome;
	}
	
	public void cadastraContato(int indice,String nome, String sobrenome, String telefone) {
		
		Contato contato = new Contato(indice, nome, sobrenome, telefone);
//		agenda1.cadastraContato(pos,contato);
		System.out.println("Cadastro realizado!");
//		this.agenda[pos] = contato;
	}
	
	public String listaContatos(){
		return agenda.toString();
	}

}
