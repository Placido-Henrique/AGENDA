package lab3;

public class Contato {
	private int indice;
	private String nome;
	private String sobrenome;
	private String telefone;
	
	public Contato (int indice,String nome, String sobrenome, String telefone) {
		this.indice = indice - 1;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

}
