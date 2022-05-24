


package fucturaBanco;

public class ContaEspecial extends Contas{
	public void resgatar(double valor, ContaCorrente cc) {
		if(getSaldo()<valor) {
			System.out.println("saldo insuficiente para resgate");
		}
		else {
			setSaldo(getSaldo() - valor);
			cc.setSaldo(cc.getSaldo() + valor);
			System.out.println("resgate realizado com sucesso");
		}
	}
	public void sacar(double valor) {
		if(getSaldo()<valor+4.5) {
			System.out.println("saldo insuficiente(obs.: taxa de 4,5 reais)");
		}
		else {
			setSaldo(getSaldo() - valor - 4.5);
			System.out.println("saque realizado com sucesso");
		}
	}
	public void mostrarSaldo() {
		System.out.println("o saldo da conta especial é: "+getSaldo());
	}
	public void dadosDaConta() {
		System.out.println("+-----------------------------------------+");
		System.out.println("|Titular Conta Especial : "+getNome());
		System.out.println("|Número da conta : "+getNumConta()+"-2");
		System.out.println("|Saldo atual : "+getSaldo());
		System.out.println("+-----------------------------------------+");
	}

}
