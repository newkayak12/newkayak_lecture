package com.kh.practice0.run;

import com.kh.practice0.animal.vo.*;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Cat("meow","cat",20,20);
		
		((Cat)animal).catGrowl();
		
		animal = new Dog("dog","mammals",40,200);
		
		((Dog)animal).dogGrowl();
		
		animal = new Monkey("mon","mammals",2,4000);
		
		((Monkey)animal).monkeyGrowl();
	
		
		System.out.println("\narray\n");
		Animal[] animalArrays = new Animal[6];
			animalArrays[0] = new Cat("mo","cat",20,30);
			animalArrays[1]	= new Cat("ew","cat",400,20);
			animalArrays[2]	= new Dog("do","dog",20,30);	
			animalArrays[3]	= new Dog("g","dog",20,30);
			animalArrays[4] = new Monkey("mon", "monkey", 20, 20);
			animalArrays[5]	= new Monkey("key", "monkey", 25, 20);	
			
			
			
				for(Animal ani : animalArrays) {
					if( ani instanceof Cat) {
						ani.growl();
					} else if(ani instanceof Dog) {
						ani.growl();
					} else if(ani instanceof Monkey) {
						ani.growl();
					}
				}
	}

}
//Animal선언하고 cat넣고 bark
//Dog넗고 bark
