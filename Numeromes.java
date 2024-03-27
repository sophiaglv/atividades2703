package estruturaCondicional2;
import java.util.Scanner;

public class Numeromes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int mes;

		System.out.println("Informe o número correspondente ao mês (1-12): ");
		mes = ler.nextInt();

		if (mes == 1) {
			System.out.println("Janeiro é o mês correspondente.");
		}
		else if (mes == 2) {
			System.out.println("Fevereiro é o mês correspondente.");
		}
		else if (mes == 3) {
			System.out.println("Março é o mês correspondente.");
		}
		else if (mes == 4) {
			System.out.println("Abril é o mês correspondente.");
		}
		else if (mes == 5) {
			System.out.println("Maio é o mês correspondente.");
		}
		else if (mes == 6) {
			System.out.println("Junho é o mês correspondente.");
		}
		else if (mes == 7) {
			System.out.println("Julho é o mês correspondente.");
		}
		else if (mes == 8) {
			System.out.println("Agosto é o mês correspondente.");
		}
		else if (mes == 9) {
			System.out.println("Setembro é o mês correspondente.");
		}
		else if (mes == 10) {
			System.out.println("Outubro é o mês correspondente.");
		}
		else if (mes == 11) {
			System.out.println("Novembro é o mês correspondente.");
		}
		else if (mes == 12) {
			System.out.println("Dezembro é o mês correspondente.");
		}
		else {
			System.out.println("Mês Inválido");
		}
		ler.close();
	}

}
