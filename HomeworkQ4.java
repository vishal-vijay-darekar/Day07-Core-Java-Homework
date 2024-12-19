package day_08;

import java.util.Scanner;

public class HomeworkQ4 {
	public static void EvenOdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is Odd");
		}
	}
	public static void main(String[] args) {
		EvenOdd();
	}
}
