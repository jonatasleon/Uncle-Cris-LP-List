import java.util.Scanner;

public class Exerc10 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int tam = 10;
		int n, count = 0;

		for(int i = 0; i < tam; i++){
			System.out.print("Digite um numero: ");
			if((n = read.nextInt()) >= 10 && n <= 20) count ++;
		}
			
		System.out.printf("%d número(s) dentro de [10, 20]\n", count);
	}
}
