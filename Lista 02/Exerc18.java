import java.util.Scanner;

public class Exerc18 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.print("Número de mercadorias: ");
		int tam = read.nextInt();
		float total, media;
		total = media = 0;

		for(int i = 0; i < tam;) {
			System.out.printf("\nValor da %dª mercadoria: ", ++i);
			total += read.nextFloat();
		}

		System.out.printf("\n\nTotal: R$%.2f\nMédia: R$%.2f\n", total, (media = total/tam));
	}
}
