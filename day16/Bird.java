package day16;

public class Bird implements AnimalBehavior {

	@Override
	public void move() {
		System.out.println("The bird files in the sky");
	}
	
    public void speak() {
    	System.out.println("The bird says :Chirp chirp!");
    }
	
    public static void main(String[] args) {
		Bird B=new Bird();
		B.speak();
		B.move();
		System.out.println(AnimalBehavior.CATEGORY);
		System.out.println(AnimalBehavior.isMaamal("Eagle"));
	}
	
}
