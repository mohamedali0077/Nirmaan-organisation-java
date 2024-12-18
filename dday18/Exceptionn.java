package dday18;

import java.util.Scanner;

public class Exceptionn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a;
	    int b;
	    int c=0;
	    try {
	    	System.out.println("enter the value");
	    
		 a=sc.nextInt();
		 System.out.println("enter a second value");
		 b=sc.nextInt();
		 
		 
		 
		 c=a+b;
		 System.out.println("Total Value" );
		 System.out.println(c);
		 
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	    
	    
	    
	    
		 }
	

	
	
}
