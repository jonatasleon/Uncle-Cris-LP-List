public class Exerc17 {
	public static void main(String[] args) {
		float media = 0;

		for(int i = 15; i <= 100; i++) {
			media += i;
		}

		System.out.printf("A média é %.2f\n", (media /= 100));

	}
}
