package day5;

public class Student {
	String StudentName="";
	int age;
	int RollNo;
	int Dateofbirth;
	
	
	public static void main(String[] args) {
		Student student1=new Student();
		student1.StudentName="Mohamed";
		student1.age=21;
		student1.RollNo=106;
		student1.Dateofbirth=209/12/2024;
		
		System.out.println(student1.StudentName);
		System.out.println(student1.age);
		System.out.println(student1.RollNo);
		System.out.println(student1.Dateofbirth);
		
		
		
		
		Student student2=new Student();
		student2.StudentName="Ali";
		student2.age=23;
		student2.RollNo=107;
		student2.Dateofbirth=210/112/2024;
		
		System.out.println(student2.StudentName);
		System.out.println(student2.age);
		System.out.println(student1.RollNo);
		System.out.println(student1.Dateofbirth);
		
		
		
	}
	
			
	
	

}
