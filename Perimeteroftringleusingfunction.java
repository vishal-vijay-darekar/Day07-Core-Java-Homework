package day_08;

import java.util.Scanner;

public class Perimeteroftringleusingfunction {
 public static int Area(int a,int b,int c) {
	 return (a+b+c);
 }
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the side1 of tringle");
	 int side1=sc.nextInt();
	 System.out.println("Enter the side2 of tringle");
	 int side2=sc.nextInt();
	 System.out.println("Enter the side3 of tringle");
	 int side3=sc.nextInt();
	 System.out.println("parameter of tringle of "+Area(side1 ,side2 ,side3));
 }
}
