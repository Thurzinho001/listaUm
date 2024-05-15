public class QuestaoCinco {
	private double raio;
	
	
	public QuestaoCinco(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double calcularArea() {
		return 3.14 * raio * raio;
	}
	
	public double calcularPerimetro() {
		return 2 * 3.14 * raio;
	}
}
