import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner readStr = new Scanner(System.in);

		do {
			double n1, n2;
			n1 = n2 = -1;

			for(int i = 0; (n1 < 0 || n1 > 10); i++) {
				if(i != 0) System.out.print("Nota invalida: ");
				System.out.print("Digite a primeira nota: ");
				n1 = read.nextDouble();
			}
		
			for(int i = 0; (n2 < 0 || n2 > 10); i++) {
				if(i != 0) System.out.print("Nota invalida: ");
				System.out.print("Digite a segunda nota: ");
				n2 = read.nextDouble();
			}

			System.out.printf("Média final: %2.2f\n", (n1 + n2) / 2);

			System.out.print("NOVO CALCULO? (S/N): ");
		}while(readStr.nextLine().equalsIgnoreCase("s"));		
	}
}
