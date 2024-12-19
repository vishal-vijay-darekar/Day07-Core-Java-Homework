package day_08;

import java.util.Scanner;

public class HomeworkQ2 {
 public static void Area() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the height of tringle");
	 int height=sc.nextInt();
	 System.out.println("Enter the Base of tringle");
	 int Base=sc.nextInt();
	 System.out.println("Area of tringle is "+((height*Base)/2));
 }
 public static void main(String[] args) {
	 Area();
 }
}
