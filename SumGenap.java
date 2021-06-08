import java.util.Scanner;
public class SumGenap {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int bilbul, sum, i, hasil;

		System.out.print("Masukkan Bilangan Bulat : ");
		bilbul = sc.nextInt();

		sum = 0;

		for (i = 0 ; i < bilbul ; i++) {
			sum = sum + 2*i;
		}
		System.out.printf("Jumlah Bilangan Bulat Genap Positif Pertama : %d", sum);
	}
}