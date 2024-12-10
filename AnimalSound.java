package day13;

       class Animal
       {
		void sound()
		{
			System.out.println("This animal make sound");
		}
       
       }
		class Dog extends Animal
		{
			@Override
			void sound()
			{
				System.out.println("The Dog barks");
			}
		}
		class Cat extends Animal
		{
			@Override
			void sound()
			{
				System.out.println("The cat meows");
			}
		}
			public class AnimalSound
			{
			public static void main(String[]args)
			{
				Dog D=new Dog();
				D.sound();
				Cat C=new Cat();
				C.sound();
				
			}
			}
					
		
			
	
			
		
