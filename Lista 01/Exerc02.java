import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		if( read.nextInt() < 0) 
			System.out.println("O número é negativo");
		else
			System.out.println("O número é positivo");
	}
}
