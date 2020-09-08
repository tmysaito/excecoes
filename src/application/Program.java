package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite os dados da conta: ");
			System.out.print("Numero: ");
			int numero = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();

			Conta testeSaldo = new Conta(numero, titular, saldo);

			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();

			Conta conta = new Conta(numero, titular, saldo, limiteSaque);

			System.out.println();
			System.out.print("Digite o valor do saque: ");
			double quantia = sc.nextDouble();
			conta.saque(quantia);
			System.out.println(conta);
		}

		catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		sc.close();
	}

}
