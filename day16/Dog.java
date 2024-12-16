package day16;

public class Dog implements AnimalBehavior{
	@Override
	public void move() {
		System.out.println("The Dog runs on four legs");
	}
	
    public void speak() {
    	System.out.println("The dog says :WoofWoof");
    }
	
    public static void main(String[] args) {
		Dog D=new Dog();
		D.speak();
		D.move();
		System.out.println(AnimalBehavior.CATEGORY);
		System.out.println(AnimalBehavior.isMaamal("Lion"));
	}
}
