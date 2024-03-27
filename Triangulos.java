package estruturaCondicional2;
import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int lado1, lado2, lado3;

		System.out.println("Informe a medida do primerio lado: ");
		lado1 = ler.nextInt();
		System.out.println("Informe a medida do segundo lado: ");
		lado2 = ler.nextInt();
		System.out.println("Informe a medida do terceiro lado: ");
		lado3 = ler.nextInt();

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("É um triângulo equilátero");
		}
		else if (lado1 == lado2 && lado1 != lado3) {
			System.out.println("É um triângulo isósceles");
		}
		else if (lado1 != lado2 && lado1 != lado3) {
			System.out.println("É um triângulo escaleno");
		}
		else {
			System.out.println("");
		}
		ler.close();
	}

}
