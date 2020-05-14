package test;

import java.util.Scanner;

public class ScanInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		float num2, sum;
		String name;
		System.out.println("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.println("정수, 실수 수를 각각 하나씩 입력하세요: ");
		num1 = sc.nextInt();
		num2 = sc.nextFloat();
		sum = num1 + num2;
		
		System.out.println("이름: " + name);
		System.out.println(num1 + " + " + num2 + "=" + sum);
	}
}
