public class QuestaoSete {
	private String nome;
	private String tipo;
	
	public QuestaoSete(String novoNome, String novoTipo){
		this.nome = novoNome;
		this.tipo = novoTipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setTipo(String novoTipo) {
		this.tipo = novoTipo;
	}

	public String emitirSom() {
		return "cococococo";
	}
}
