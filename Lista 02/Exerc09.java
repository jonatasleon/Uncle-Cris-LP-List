import java.util.Scanner;

public class Exerc09 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int tam = 10;
		int count = 0;

		for(int i = 0; i < tam;) {
			System.out.printf("Digite o %dº número: ", ++i);
			if(read.nextInt() < 0) count++;	
		}

		System.out.printf("%d números são negativos\n", count);
	}
}
