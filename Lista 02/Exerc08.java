import java.util.Scanner; 

public class Exerc08 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int n;

		System.out.print("Digite um numero inteiro entre 1 e 10: ");
		while((n = read.nextInt()) < 1 || n > 10) System.out.print("ERRO: O número deve se entre 1 e 10: ");
		for(int i = 1; i <= 10; i++) System.out.printf("\t%2d x %2d = %3d\n", n, i, n*i);
	}
}
