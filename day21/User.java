package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		BookManagement book=new BookManagement();
		ArrayList<BookManagement>a1=new ArrayList<BookManagement>();
	    Boolean isTrue=true;
	    
	while(isTrue) {
		 System.out.println("Enter your choice");
		 System.out.println("1 for add");
		 System.out.println("2 for show");
		 System.out.println("3 for update");
		 System.out.println("4 for remove");
		 System.out.println("0 for exit");
		 int key=sc.nextInt();
		 sc.nextLine();
		 
		 
		 if(key==1) {
			 System.out.println("Enter the Author name :");
			 String Authorname=sc.nextLine();
			 System.out.println("Enter the book price");
			 double price=sc.nextDouble();
			 sc.nextLine();
			 System.out.println("Enter the Title");
			 String Title=sc.nextLine();
			 System.out.println("Enter the NoOfPages");
			 int NoOfPages=sc.nextInt();
			
			 a1.add(book =new BookManagement(Authorname,price,Title,NoOfPages));
		 
		 } else if(key==2) {
			 System.out.println("Enter the Book name:");
			 String value=sc.nextLine();
			 boolean isThere=false;
			 for(BookManagement book1:a1) {
				 if(value.equalsIgnoreCase(book1.getAuthorname())) {
				 isThere=true;
				 System.out.println("Enter the new book name");
				 String newBook=sc.nextLine();
				 book1.setAuthorname(newBook);
			 }}
			
		 
		 
		 
		 
		 
	}else if (key==3) {
		
	}

	else {
		System.out.println("thank you!");
		break;
	
	
		
	}}}}

