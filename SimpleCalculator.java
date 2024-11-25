package day2;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter your choice");
		System.out.println("Enter your 0 for add");
		System.out.println("Enter your 1 for sub");
		System.out.println("Enter your 2 for mul");
		System.out.println("Enter your 3 for div");
		System.out.println("Enter your 4 for mod");
		int key=scan.nextInt();
		
		
		
		System.out.println("enter the firstNum");
		int firstNum=scan.nextInt();
		System.out.println("enter the secondNum");
		int secondNum=scan.nextInt();
		
		
//		if (key==0){
//			int total=firstNum+secondNum;
//			System.out.println("add :"+total);
//		}else if(key==1){
//			    int total=firstNum-secondNum;
//				System.out.println("sub :"+total);
//		}else if(key==2) {
//			int total=firstNum*secondNum;
//			System.out.println("mul :"+total);
//		}else if(key==3) {
//			int total=firstNum/secondNum;
//			System.out.println("div :"+total);
//		}else if(key==4) {
//			int total=firstNum%secondNum;
//			System.out.println("mod :"+total);
//	}else {
//		System.out.println("Enter your choice");
//		
		switch(key){
		case 0:{
			    int total=firstNum+secondNum;
		        System.out.println("add :"+total);
		        break;
		}
		case 1:{
			   int total=firstNum-secondNum;
			   System.out.println("sub :"+total);
			   break;
		}
		case 2:{
			   int total=firstNum*secondNum;
			   System.out.println("mul:"+total);
			   break;
		}
		case 3:{
			int total=firstNum/secondNum;
			System.out.println("div :"+total);
			break;
		}
		case 4:{
			int total=firstNum%secondNum;
			System.out.println("mod :"+total);
			break;
		}
		}
			
	}
	
			
			
				
		
			
			
			
			
		
			
         	
	}
	


