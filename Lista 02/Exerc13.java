import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int tam = 10;
		int soma = 0;

		for(int i = 0; i < tam; i++){
			System.out.printf("Digite o %2dº número: ", i+1);
			soma += read.nextInt();
		}
		System.out.printf("A soma é %2d\n", soma);
	}
}
