package day15;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		System.out.println("Addition");
		System.out.println(cal.add (a,b));
		System.out.println("Subtration");
		System.out.println(cal.sub(a,b));
		System.out.println("multiplication");
		System.out.println(cal.mul(a,b));
		System.out.println("division");
		System.out.println(cal.div(a,b));
	}

}
