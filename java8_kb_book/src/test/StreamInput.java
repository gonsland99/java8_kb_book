package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamInput {
	public static void main(String[] args) throws IOException {
	
		String name;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("����� �̸��� ? ");
		name = inbr.readLine();
		System.out.print("����� �̸��� " + name + "�Դϴ�.");
	}
}
