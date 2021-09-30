import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double media = 0;
		double media2 = 0;
		double media3 = 0;

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				System.out.println("digite as notas para primeira media: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();

				media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			} 
			else if (i == 1) {
				System.out.println("digite as notas para segunda media: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();

				media2 = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			}
			else if (i == 2) {
				System.out.println("digite as notas para terceira media: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();

				media3 = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
			}

		}
		System.out.printf("primeira media:%.1f%n", media);
		System.out.printf("segunda media:%.1f%n", media2);
		System.out.printf("terceira media:%.1f%n", media3);

		sc.close();
	}

}
