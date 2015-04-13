import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int tam = 10;
		float soma = 0;

		for(int i = 0; i < tam; i++){
			System.out.printf("Digite o %2dº número: ", i+1);
			soma += read.nextInt();
		}
		System.out.printf("A média é %2.2f\n", (soma /= tam));
	}
}
