package fucturaBanco;




public class ContaCorrente extends Contas{
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("valor depositado com sucesso");
	}
	public void sacar(double valor) {
		if(getSaldo()<valor) {
			System.out.println("saldo insuficiente");
		}
		else {
			System.out.println("saque realizado com sucesso");
			setSaldo(getSaldo() - valor);
		}
	}
	public void aplicarPoupança(double valor, ContaPoupança cp) {
		if(getSaldo()<valor) {
			System.out.println("saldo insuficiente");
		}
		else {
			System.out.println("valor aplicado na poupança com sucesso");
			setSaldo(getSaldo() - valor);
			cp.setSaldo(cp.getSaldo() + valor);
		}
	}
	public void aplicarEspecial(double valor, ContaEspecial ce) {
		if(getSaldo()<valor) {
			System.out.println("saldo insuficiente");
		}
		else {
			setSaldo(getSaldo() - valor);
			ce.setSaldo(ce.getSaldo() + valor);
			System.out.println("valor aplicado na conta especial com sucesso");
		}
	}
	public void dadosDaConta() {
		System.out.println("+-----------------------------------------+");
		System.out.println("|Titular Conta Corrente : "+getNome());
		System.out.println("|Número da conta : "+getNumConta());
		System.out.println("|Saldo atual : "+getSaldo());
		System.out.println("+-----------------------------------------+");
	}
	public void mostrarSaldo() {
		System.out.println("o saldo da conta corrente é: "+getSaldo());
	}

}
