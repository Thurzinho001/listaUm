package lista;

public class QuestaoSeis {
	private int dia;
	private int mes;
	private int ano;
	
	public QuestaoSeis(int novoDia, int novoMes, int novoAno){
		this.dia=novoDia;
		this.mes=novoMes;
		this.ano=novoAno;
	}
	
	
	public int getDia(){
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setDia(int novoDia) {
		this.dia = novoDia;
	}
	
	public void setMes(int novaData) {
		this.mes = novaData;
	}
	
	public void setAno(int novoAno) {
	}
	
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	

}
