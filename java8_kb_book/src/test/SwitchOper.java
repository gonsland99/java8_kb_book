package test;

import java.util.Scanner;

public class SwitchOper {
	public static void main(String[] args) {
		int jumsu;
		String dept;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과를 입력하세요 : ");
		dept = sc.nextLine();
		System.out.println("점수를 입력하세요 : ");
		jumsu = sc.nextInt();
		
		switch(dept) {
		case	"컴퓨터 공학부": 
			System.out.println("학부: " + dept);
			break;
		case	"정보통신 공학부": 
			System.out.println("학부: " + dept);
			break;
		default : 
			System.out.println("학부: 멀티미디어 공학부");
		}
		
		switch(jumsu/10) {
		case 1: System.out.println("당신의 학점은 A !");
		case 2: System.out.println("당신의 학점은 B !");
		case 3: System.out.println("당신의 학점은 C !");
		case 4: System.out.println("당신의 학점은 D !");
		default: System.out.println("당신의 학점은 F !");
		}
	}
}
