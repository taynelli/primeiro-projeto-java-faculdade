import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double raio;
		double altura;
		double area;
		double latas;
		double custo;
		double pi = Math.PI;

		System.out.print("Digite o raio da base do tanque: "); // prompt
		raio = input.nextDouble();

		System.out.print("Digite a altura da base do tanque: ");
		altura = input.nextDouble();

		area = (2 * pi * raio * raio) + (2 * pi * raio * altura);
		latas = area / 3;
		custo = latas * 50;
		System.out.printf("Custo da obra %.2f", custo);

	}

}
