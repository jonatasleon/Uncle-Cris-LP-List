import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner readStr = new Scanner(System.in);

		double n1, n2;

		do {
			System.out.print("Digite a primeira nota: ");
			while((n1 = read.nextDouble()) < 0 || n1 > 10) System.out.print("Erro: Digite uma nota entra 0 e 10: ");
	
			System.out.print("Digite a segunda nota: ");
			while((n2 = read.nextDouble()) < 0 || n2 > 10) System.out.print("Erro: Digite uma nota entre 0 e 10: ");

			System.out.printf("Média final: %2.2f\n", (n1 + n2) / 2);

			System.out.print("NOVO CALCULO? (S/N): ");
		}while(readStr.nextLine().equalsIgnoreCase("s"));		
	}
}
