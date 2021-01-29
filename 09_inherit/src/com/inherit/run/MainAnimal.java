package com.inherit.run;

import com.inherit.model.vo.override.animal_example.Cat;
import com.inherit.model.vo.override.animal_example.Dog;

public class MainAnimal {

	public static void main(String[] args) {
		Cat cat = new Cat("neow", 5, "cat_mammls");
		Dog dog = new Dog("poppy", 4, "dog_mammls");
		
		
		
		System.out.println(cat.growl());
		System.out.println(dog.growl());
	}

}
