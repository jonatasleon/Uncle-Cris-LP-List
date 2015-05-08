import java.util.Scanner;

public class ProvaN02 {
	public static void main(String[] args) {
		Scanner readStr = new Scanner(System.in);
		String op = "";
		do {
			System.out.print("----------------MENU----------------\n(1)\tCriptografar\n(2)\tDescriptografar\n(3)\tSair\n>>>> ");
			op = readStr.nextLine();
			switch(op) {
				case "1":
					String palavra = readStr.nextLine();
					String res = "";
					for(int i = 0; i < palavra.length(); i++) {
						res += String.format("%03d", ((int) palavra.charAt(i)));
					}
					System.out.println(res);
					break;
					
				case "2":
					String cod = readStr.nextLine();
					String deRes = "";
					
					if(cod.length() % 3 != 0) {
						System.out.println("Código inválido");
						break;
					}
					
					for(int i = 0; i < cod.length(); i+=3) {
						deRes += (char)Integer.valueOf(cod.substring(i, i+3)).intValue();
					}
					
					System.out.println(deRes);
					break;
					
				case "3":
					System.out.println("Saindo...");
					break;
					
				default:
					System.out.println("Opção inválida");
					
			}
			
		}while(!op.equalsIgnoreCase("3"));
	}
}
