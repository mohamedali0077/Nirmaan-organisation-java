package day12;
import java.util.Scanner;
public class SingleBookManagement {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			boolean isTrue=true;
			
			
		 SingleBooks book=new SingleBooks();
		
		 
		 while(isTrue) {
			 System.out.println();
			 System.out.println("1 for add");
			 
			 System.out.println("2 for show");
			 System.out.println("0 for exit");
			 int value=sc.nextInt();
			 sc.nextLine();
		 
		 switch(value) {
		 case 1:
		 {
			 System.out.println("title");
			 String title = sc.nextLine();
			 book.setTitle(title);
			 
			 
			 System.out.println("Author");
			 String Author=sc.nextLine();
			 book.setAuthor(Author);
			 
			 
			 System.out.println("price");
			 Double price=sc.nextDouble();
			 book.setPrice(value);
			 
			 System.out.println("Numberofcopies");
			 String Numberofcopies=sc.nextLine();
			 book.setNumberofcopies(value);
			 
		 }
		 
		 
		 
		 case 2:{
			 System.out.println("title");
			 String title = sc.nextLine();
			 book.setTitle(title);
			 
			 
			 System.out.println("Author");
			 String Author=sc.nextLine();
			 book.setAuthor(Author);
			 
			 
			 System.out.println("price");
			 Double price=sc.nextDouble();
			 book.setPrice(price);
			 
			 System.out.println("Numberofcopies");
			 String Numberofcopies=sc.nextLine();
			 book.setNumberofcopies(value);
			 break;
			 
			
			 case 3:{
				 System.out.println(book.toString());
				 break;
			 }
			 
		 
		 
		 
		 case 0:{
			 isTrue=false;
			 break;
			 
			 
			 
		 }
		 
		 }
		 
			
		 
		 
		 
			
//			book.setTitle("think positive");
//			book.setAuthor("Mohamed");
//			book.setPrice(150.90);
//			book.setNumberofcopies(5);
////			
//			
//			System.out.println(book.getTitle());
//			System.out.println(book.getAuthor());
//			System.out.println(book.getPrice());
//			System.out.println(book.getNumberofcopies());
//					
//					System.out.println(book);
//					
//			
		}

		 }

}}
