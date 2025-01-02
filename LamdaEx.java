package day26;

@FunctionalInterface
interface calc {
     void add();
}
	
public class LamdaEx {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		calc c1= () -> System.out.println(a+b);
		
		c1.add();
		
		}
	}
