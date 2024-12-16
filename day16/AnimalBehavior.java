package day16;

public interface AnimalBehavior {

	String CATEGORY = "human being";

	static boolean isMaamal(String animalName) {
		return (animalName.equalsIgnoreCase("Dog")) || (animalName.equalsIgnoreCase("Cat"))
				|| (animalName.equalsIgnoreCase("Human"));
	}

	default void speak() {
		System.out.println("Animal is making a sound");
	}
	
	
	void move();
	
}
