package baekjoon;

import java.util.Scanner;

public class Ch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목수를 입력하세요");
		int N = sc.nextInt();
		int A[] = new int[N];
		System.out.println("과목 점수를 입력해 주세요");
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		long sum = 0;
		long max = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] > max)
				max = A[i];
			sum = sum + A[i];
		}
		System.out.println(sum * 100.0 / max / N);
	} 
 
}
