package estruturaCondicional2;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int cpf, senha, saldo=1000, sacar;

		System.out.println("Informe o seu CPF: ");
		cpf = ler.nextInt();

		if (cpf == 1234567890) {
			System.out.println("Informe a sua senha: ");
			senha = ler.nextInt();

			if (senha == 123456) {
				System.out.println("Olá, seu saldo atual é $" + saldo);
				System.out.println("Quanto você deseja sacar? ");
				sacar = ler.nextInt();

				if (sacar <= saldo) {
					System.out.println("Saque feito com sucesso!");
				}
				else {
					System.out.println("Saldo insuficiente.");
				}
			}
			else {
				System.out.println("Senha incorreta");
			}

		}
		else {
			System.out.println("CPF incorreto.");
		}
		ler.close();

	}

}
