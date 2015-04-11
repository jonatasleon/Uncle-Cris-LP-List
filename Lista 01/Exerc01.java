import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Digite um número: ");
		if( read.nextInt() > 10 ) {
			System.out.println("É maior que 10");
		}else {
			System.out.println("Não é maior que 10!");
		}
	}
}
