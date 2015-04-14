import java.util.Scanner;

public class Exerc19 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner readStr = new Scanner(System.in);

		int tam = 0;
		float total, media;
		total = media = 0;

		do{
			System.out.printf("\nValor da %dª mercadoria: ", ++tam);
			total += read.nextFloat();
			System.out.print("Mais mercadorias? ");
		}while(readStr.nextLine().equalsIgnoreCase("S"));

		System.out.printf("\n\nTotal: R$%.2f\nMédia: R$%.2f\n", total, (media = total/tam));
	}
}
