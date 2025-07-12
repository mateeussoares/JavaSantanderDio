package Desafio;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o número da sua conta: ");
		String conta = sc.next();
		System.out.println("Informe sua agência: ");
		int agencia = sc.nextInt();
		System.out.println("Agora, informe o saldo:");
		Double saldo = sc.nextDouble();
		
		System.out.printf("Olá, %s! Obrigado por criar uma conta em "
				+ "nosso banco! \nSua agência é %d, conta número %s e seu saldo (R$ %.2f)"
				+ " já está disponível na sua conta.", nome, agencia, conta, saldo);
		
		
		sc.close();
	}
}
