package Banco;

import java.util.Scanner;

import fucturaBanco.ContaCorrente;
import fucturaBanco.ContaEspecial;
import fucturaBanco.ContaPoupança;

public class Banco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bem-vindo ao banco, vamos começar com o cadastramentos dos dados da conta corrente, poupança e conta especial");
		System.out.println("digite seu nome:");
		String nome = input.nextLine();
		System.out.println("digite o número da sua conta:");
		int numConta = input.nextInt();
		System.out.println("digite seu saldo inicial da conta corrente:");
		double saldoCorrente = input.nextDouble();
		System.out.println("digite seu saldo inicial da conta poupança:");
		double saldoPoupança = input.nextDouble();
		System.out.println("digite seu saldo inicial da conta especial");
		double saldoEspecial = input.nextDouble();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupança cp = new ContaPoupança();
		ContaEspecial ce = new ContaEspecial();
		cc.setNome(nome);
		cc.setNumConta(numConta);
		cc.setSaldo(saldoCorrente);
		cp.setNome(nome);
		cp.setNumConta(numConta);
		cp.setSaldo(saldoPoupança);
		ce.setNome(nome);
		ce.setNumConta(numConta);
		ce.setSaldo(saldoEspecial);
		int n=1;
		System.out.println("cadastramento realizado com sucesso, agora digite a sua ação: ");
		System.out.println(" a cada ação, a conta poupança rende 10%");
		while(n!=0) {
			System.out.println("+---------- Banco ações -------------+");
			System.out.println("|   (1) sacar da conta corrente      |");
			System.out.println("|   (2) sacar da conta especial      |");
			System.out.println("|   (3) depositar na conta corrente  |");
			System.out.println("|   (4) resgatar pela poupança       |");
			System.out.println("|   (5) resgatar pela conta especial |");
			System.out.println("|   (6) aplicar na poupança          |");
			System.out.println("|   (7) aplicar na conta especial    |");
			System.out.println("|   (8) mostrar saldos               |");
			System.out.println("|   (9) mostrar dados das 3 contas   |");
			System.out.println("|   (0) sair                         |");
			System.out.println("+------------------------------------+");
			n = input.nextInt();
			cp.render();
			while(n>9 || n<0) {
				System.out.println("opção inválida, escolha novamente: ");
				n = input.nextInt();
			}
			if(n==0) {
				System.out.println("operação finalizada com sucesso");
				break;
			}
			if(n==1) {
				System.out.println("você escolheu sacar da conta corrente. Escolha o valor do saque:");
				double saqueCorrente = input.nextDouble();
				cc.sacar(saqueCorrente);
			}
			if(n==2) {
				System.out.println("você escolheu sacar da conta especial. Escolha o valor do saque(obs.: taxa de 4,5 reais)");
				double saqueEspecial = input.nextDouble();
				ce.sacar(saqueEspecial);
			}
			if(n==3) {
				System.out.println("você escolheu depositar na conta corrente. Escolha o valor do depósito:");
				double depositoCorrente = input.nextDouble();
				cc.depositar(depositoCorrente);
			}
			if(n==4) {
				System.out.println("você escolheu resgatar pela poupança. Escolha um valor de resgate: ");
				double resgatePoupança = input.nextDouble();
				cp.resgatar(resgatePoupança, cc);
			}
			if(n==5) {
				System.out.println("você escolheu resgatar pela conta especial. Escolha um valor de resgate:");
				double resgateEspecial = input.nextDouble();
				ce.resgatar(resgateEspecial, cc);
			}
			if(n==6) {
				System.out.println("você escolheu aplicar na poupança. Escolha um valor para aplicar:");
				double aplicarPoupança = input.nextDouble();
				cc.aplicarPoupança(aplicarPoupança, cp);
			}
			if(n==7) {
				System.out.println("você escolheu aplicar na conta especial. Escolha um valor para aplicar:");
				double aplicarEspecial = input.nextDouble();
				cc.aplicarEspecial(aplicarEspecial, ce);
			}
			if(n==8) {
				cc.mostrarSaldo();
				cp.mostrarSaldo();
				ce.mostrarSaldo();
			}
			if(n==9) {
				cc.dadosDaConta();
				cp.dadosDaConta();
				ce.dadosDaConta();
			}
			
			System.out.println("gostaria de repetir o processo?");
			System.out.println("(qualquer valor) SIM       (0) NÃO");
			n = input.nextInt();
			if( n==0) {
				System.out.println("operação finalizada com sucesso");
			}
			
		}
		input.close();

	}

}
