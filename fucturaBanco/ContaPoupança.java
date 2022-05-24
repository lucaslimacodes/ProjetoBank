


package fucturaBanco;

public class ContaPoupan�a extends Contas{
	public void resgatar(double valor, ContaCorrente cc) {
		if(getSaldo()<valor) {
			System.out.println("saldo insuficiente para resgate");
		}
		else {
			System.out.println("resgate realizado com sucesso");
			setSaldo(getSaldo() - valor);
			cc.setSaldo(cc.getSaldo() + valor);
		}
	}
	public void dadosDaConta() {
		System.out.println("+-----------------------------------------+");
		System.out.println("|Titular Poupan�a : "+getNome());
		System.out.println("|N�mero da conta : "+getNumConta()+"-1");
		System.out.println("|Saldo atual : "+ getSaldo());
		System.out.println("+-----------------------------------------+");
	}
	public void mostrarSaldo() {
		System.out.println("o saldo da poupan�a �: "+getSaldo());
	}
	public void render() {
		setSaldo(getSaldo()*1.1);
	}

}
