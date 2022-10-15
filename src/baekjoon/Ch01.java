package baekjoon;

import java.util.Scanner;

public class Ch01 {
	public static void main(String[] args) {
		//1172번
		Scanner sc = new Scanner(System.in);
		System.out.println("몇자리의 수입니까?");
		int N =  sc.nextInt();
		System.out.println("숫자를입력해주세요");
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		sc.close();
		
		int sum = 0;
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';//아키코드 숫자의 코드값차이 -	
		}
		System.out.println(sum);
	}
}
