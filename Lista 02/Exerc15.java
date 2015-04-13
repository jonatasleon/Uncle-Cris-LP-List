import java.util.Scanner;

public class Exerc15 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int n1 = read.nextInt();

		System.out.print("Digite o segundo valor: ");
		int n2 = read.nextInt();

		for(int i = n1; i <= n2; i++) System.out.printf(((i!=n2)?"%d, ":"%d\n"), i);
	}
}
