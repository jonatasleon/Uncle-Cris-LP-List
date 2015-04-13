import java.util.Scanner;

public class Exerc12 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o total de alunos: ");
		int tam = read.nextInt();
		float soma = 0;

		for(int i = 0; i < tam; i++){
			System.out.printf("Digite a nota do %2dº aluno: ", i+1);
			soma += read.nextInt();
		}
		System.out.printf("A média de todos os alunos é %2.2f\n", (soma /= tam));
	}
}
