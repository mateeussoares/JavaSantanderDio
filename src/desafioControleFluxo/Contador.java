package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		boolean teste = true;
		
		do {
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);
			teste = false;
		} catch (ParametrosInvalidosException exception) { 
			System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro."); 
			System.out.println("Digite os novos parâmetros corretamente. \n");
			}
		}
		
		
		while (teste);
		}
		
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser MAIOR que o primeiro"); 
		}

			int contagem = parametroDois - parametroUm;

			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
		}
	}
}
