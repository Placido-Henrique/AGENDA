package lab3;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	
	public Agenda(String nome) {
		this.contatos = new Contato[100];
		this.nome = nome;
	}
	
	public void cadastraContato(int pos,String nome, String sobrenome, String telefone) {
		
		Contato contato = new Contato(pos, nome, sobrenome, telefone);
		this.contatos[pos-1] = contato;
	}
	
	public String listaContatos(){
		String saida = "";
		for (int i=0;i < contatos.length;i++) {
			if (!contatoNulo(i+1)) {
				saida += this.contatos[i].toStr()+ "\n";
			}
		}
		return saida;
	}
	
	public String exibeContato(int indice) {
		return this.contatos[indice].exibe();
		
	}
	
	public boolean contatoNulo(int pos) {
		return this.contatos[pos-1]== null;
	}

}