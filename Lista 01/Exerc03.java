import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qntd;
		float res;
		System.out.print("Digite o número de maçãs: ");
		qntd = read.nextInt();

		res = (qntd < 12)?qntd*1.3f:qntd;

		System.out.printf("As maçãs custaram R$%.2f\n", res);
	}
}
