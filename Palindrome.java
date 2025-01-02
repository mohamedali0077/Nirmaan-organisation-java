package day26;

public class Palindrome {
	
	public static void main(String[] args) {
		String name="Madam ";
		
		
	char[] let = name.toCharArray();
	
	String removedSpace = "";
	
	for(int i = 0;i<let.length;i++) {
	if(let[i]==' ') {
		
	}else {
		 removedSpace +=  let[i];
	}
	}
		System.out.println(removedSpace);
		
		String rn = "";
		for(int i = removedSpace.length()-1;i>=0;i--) {
			rn +=removedSpace.charAt(i);
			
		}
		System.out.println(rn);
		if(rn.equalsIgnoreCase(removedSpace)) {
			System.out.println("It is pallidrome");
		}else {
			System.out.println("Not a pallidrome");
		}
		
	}
}
