package com.implicit.casting;

public class AnimalDogCast
	{

		public static void main(String[] args)
			{
				Animal a[] =
					{new Animal(), new Dog(), new Animal()};
				for (Animal animal : a)
					{
						animal.makeNoise();
						if (animal instanceof Dog)   // always compare  with object
							{
								// animal.playDead();
								((Dog) animal).playDogStuff();

								Dog d = (Dog) animal;
								d.playDogStuff();
								//animal.playDogStuff(); //compiltaion problem
							}
						System.out.println("*********");
					}
				

			}

	}
