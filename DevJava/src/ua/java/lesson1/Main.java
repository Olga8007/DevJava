package ua.java.lesson1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/** 1.
		�������� ��������, �� �������� �
		��������� �� �����, �� � ���� �����
		�������� � ����� n, ������ ��� ��������.

		2.     �������� ��������, �� �������� �� ����� ��������� �� 10 � ����
		�����, ��������� � ���� m � n. ���������, ����� ����� 8,5 � 11,45
		��������� �� ������ 11,45.
		 **/ 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int res = sc.nextInt();
		
		System.out.println("Your input is: " + res);
		
		if (res % 2 == 0) {
			System.out.println("Yes");
			
		} else {
			System.out.println("No!");
		}
		
		int c = 123456 % 1000;
		System.out.println(c);
		
		System.out.println("Enter m= ");
		int m = sc.nextInt();
		System.out.println("Enter n= ");
		int n = sc.nextInt();
		
		double t = 10 - m;
		double p = 10 - n;
		
		if (t>p){
			System.out.println("M digit closer  to 0 .");
			
		} else if (t<p){
			System.out.println("N digit closer to 0 .");
			
		} else {
			System.out.println("Both equal.");
		}
	}
}

