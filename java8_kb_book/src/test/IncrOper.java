package test;

public class IncrOper {
	public static void main(String[] args) {
		int a, b, c, d ;
		a=b=c=d=10;
		
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"번째 결과: a = "+ (a++) + ", b = " + (++b) + ", c = " +(c--) + ",d = " +(--d));
		}
	}
}
