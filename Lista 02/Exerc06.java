import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		System.out.printf("Digite o valor de N: ");
		while((n = read.nextInt()) < 1) System.out.print("Digite um número maior que 0: ");
		for(int i = 1; i <= n; i++) System.out.println(i);
	}
}
