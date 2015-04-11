import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.printf("Digite o valor de N: ");
		int n = read.nextInt();
		for(int i = 1; i <= n; i++) System.out.println(i);
	}
}
