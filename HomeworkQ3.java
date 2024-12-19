package day_08;

import java.util.Scanner;

public class HomeworkQ3 {
	public static void Circumference() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		System.out.println("Circumference: "+(2*(3.14*radius)));
		
	}
	public static void main(String[] args) {
		Circumference();
	}
}
