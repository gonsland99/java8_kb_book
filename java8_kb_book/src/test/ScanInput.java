package test;

import java.util.Scanner;

public class ScanInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		float num2, sum;
		String name;
		System.out.println("�̸��� �Է��ϼ���: ");
		name = sc.nextLine();
		System.out.println("����, �Ǽ� ���� ���� �ϳ��� �Է��ϼ���: ");
		num1 = sc.nextInt();
		num2 = sc.nextFloat();
		sum = num1 + num2;
		
		System.out.println("�̸�: " + name);
		System.out.println(num1 + " + " + num2 + "=" + sum);
	}
}
