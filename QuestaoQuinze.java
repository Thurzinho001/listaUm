public class QuestaoQuinze {
	private Data data;
	private String hora;
	
	public QuestaoQuinze(Data novaData, String novaHora) {
		this.data = novaData;
		this.hora = novaHora;
	}
	
	public Data getData() {
		return data;
	}
	public String getHora() {
		return hora;
	}
	public void setData(Data novaData) {
		this.data = novaData;
	}
	public void setHora(String novaHora) {
		this.hora = novaHora;
	}
}
