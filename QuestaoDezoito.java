public class QuestaoDezoito {
	private String nome;
	private String codigo;
	
	public QuestaoDezoito(String novoNome, String novoCodigo) {
		this.nome = novoNome;
		this.codigo = novoCodigo;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setCodigo(String novoCodigo) {
		this.codigo = novoCodigo;
	}
}
