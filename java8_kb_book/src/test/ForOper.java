package test;

import java.util.Scanner;

public class ForOper {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �ﰢ�� ���̴� ? ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
