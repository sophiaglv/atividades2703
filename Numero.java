package estruturaCondicional2;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;

		System.out.println("Digite o numero: ");
		numero = ler.nextInt();

		if (numero > 0) {
			System.out.println("O número é positivo.");
		}
		else if (numero == 0) {
			System.out.println("O número é zero.");
		}
		else {
			System.out.println("O número é negativo.");
		}
		ler.close();
	}

}
