package day19;

import java.util.Scanner;

public class ExceptionHandling {

	              public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					
					try {
						System.out.println("Enter your age");
						int age=sc.nextInt();
						
						if(age>0) {
							System.out.println(age);
						}
					else {
						throw new ArithmeticException();
						
					}}
					catch(ArithmeticException age) {
					System.out.println("enter correct age");
					}
					catch(Exception E) {
						System.out.println(E);
						
					}
					finally {
						System.out.println("age is not accept");
					}
					
					
					
					
					
					
					}
				}

				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

