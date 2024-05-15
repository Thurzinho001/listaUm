public class ContaCorrente {
	private int numeroDaConta;
	private double saldo;
	
	public ContaCorrente(int novoNumeroDaConta, double novoSaldo){
		this.numeroDaConta = novoNumeroDaConta;
		this.saldo = novoSaldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public double depositar(double a) {
		return this.saldo = saldo += a;
	}
	
	public double sacar(double b) {
		return this.saldo = saldo -= b;
	}
	
	public String contaCorrente () {
		return "Conta: " + numeroDaConta + "\nSaldo: R$" + saldo;
	}
}
