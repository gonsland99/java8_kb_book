package test;

import java.util.Scanner;

public class SwitchOper {
	public static void main(String[] args) {
		int jumsu;
		String dept;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ��� : ");
		dept = sc.nextLine();
		System.out.println("������ �Է��ϼ��� : ");
		jumsu = sc.nextInt();
		
		switch(dept) {
		case	"��ǻ�� ���к�": 
			System.out.println("�к�: " + dept);
			break;
		case	"������� ���к�": 
			System.out.println("�к�: " + dept);
			break;
		default : 
			System.out.println("�к�: ��Ƽ�̵�� ���к�");
		}
		
		switch(jumsu/10) {
		case 1: System.out.println("����� ������ A !");
		case 2: System.out.println("����� ������ B !");
		case 3: System.out.println("����� ������ C !");
		case 4: System.out.println("����� ������ D !");
		default: System.out.println("����� ������ F !");
		}
	}
}
