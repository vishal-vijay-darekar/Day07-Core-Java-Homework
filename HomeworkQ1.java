package day_08;

import java.util.Scanner;

public class HomeworkQ1 {
	public static void Operations() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1=sc.nextInt();
		System.out.println("Enter the first Second");
		int num2=sc.nextInt();
		System.out.println(num1+ " + "+num2+ " = " +(num1+num2));
		System.out.println(num1+ " * "+num2+ " = " +(num1*num2));
		System.out.println(num1+ " / "+num2+ " = " +(num1/num2));
		System.out.println(num1+ " % "+num2+ " = " +(num1%num2));
	}
	public static void main(String[] arg) {
		Operations();
	}
}
