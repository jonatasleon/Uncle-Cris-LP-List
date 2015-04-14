import java.util.Scanner;

public class Exerc20 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int tam = 5, valor;
		int maior, menor;
		maior = menor = 0;

		for(int i = 0; i < tam; i++) {
			System.out.print("Digite o valor: ");
			valor = read.nextInt();
			if(i == 0) {
				menor = maior = valor;
			}else if(valor < menor) {
				menor = valor;
			}else if(valor > maior) {
				maior = valor;
			}
		}

		System.out.printf("Menor: %d\nMaior: %d\n", menor, maior);
	}
} 
