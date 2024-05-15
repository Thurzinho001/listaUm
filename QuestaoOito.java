public class QuestaoOito {
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public QuestaoOito(String novoNome, double novoPreco, int novaQuantidade) {
		this.nome = novoNome;
		this.preco = novoPreco;
		this.quantidade = novaQuantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuntidade() {
		return quantidade;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	
	public void setQualidade(int novaQuantidade) {
		this.quantidade = novaQuantidade;
	}
	
	public double calcularTotal() {
		return preco * quantidade;
	}
}
