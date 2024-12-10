package day14;
import java.util.Scanner;
public class SingleEmployeeManagement {
      public static void main(String[]arge) {
    	  
    	  Scanner sc=new Scanner(System.in);
    	  boolean isTrue=true;
    	  Employee E=new Employee();
    	  
    	  
    	  while(isTrue) {
    		  System.out.println();
 			 System.out.println("1 for add EmpDetails");
 			 System.out.println("2 for view EmpDetails");
 			 System.out.println("3 for update EmpDetails");
 			 System.out.println("0 for exit");
 			 int value=sc.nextInt();
 			 sc.nextLine();
    	  
    	  switch(value){
    	  
    	  case 1:
 		 {
 			 System.out.println("EmpName");
 			 String EmpName= sc.nextLine();
 			 E.setEmpName(EmpName);
 			 
 			 
 			 System.out.println("Department");
 			 String Department=sc.nextLine();
 			 E.setDepartment(Department);
 			 
 			 
 			 System.out.println("id");
 			 int id=sc.nextInt();
 			 E.setId(id);
 			 sc.nextLine();
 			 System.out.println("PhoneNo");
 			 Long PhoneNo=sc.nextLong();
 			 sc.nextLine();
 			 E.setPhoneNo(PhoneNo);
 			 break;
 		 }
    	  case 2:
  		 {
  			 System.out.println("EmpName");
  			 String EmpName= sc.nextLine();
  			 E.setEmpName(EmpName);
  			 
  			 
  			 System.out.println("Department");
  			 String Department=sc.nextLine();
  			 E.setDepartment(Department);
  			 
  			 
  			 System.out.println("id");
  			 int id=sc.nextInt();
  			 E.setId(id);
  			 sc.nextLine();
  			 System.out.println("PhoneNo");
  			 long PhoneNo=sc.nextLong();
  			 E.setPhoneNo(PhoneNo);
  			 break;
  		 }
    	  case 3:
    	  {
    		  System.out.println(E.toString());
				 break;
    	  }
    	  case 0:{
 			 isTrue=false;
 			 System.out.println("Thank you");
 			 break;
 		 
    	  }
      }
}}}
