import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int num[] = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int V = sc.nextInt();
		for (int j = 0; j < N; j++) {
			if (num[j] == V) {
				sum += 1;
			}
		}
		System.out.println(sum);
	}

}
