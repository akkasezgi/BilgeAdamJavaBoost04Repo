package com.bilgeadam.boost.week05.lesson004.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("Coco", "Shih-tzu");
		
		try {
			FileOutputStream file = new FileOutputStream("file.txt");
			
			ObjectOutputStream output = new ObjectOutputStream(file);
			
			output.writeObject(dog);
			
			FileInputStream fileStream = new FileInputStream("file.txt");
			ObjectInputStream input = new ObjectInputStream(fileStream);
			
			Dog newDog = (Dog) input.readObject();
			System.out.println("Dog name: " + newDog.name + "/" + "Dog breed: " + newDog.breed);
			output.close();
			input.close();
		
		}catch (Exception e) {
			e.getStackTrace();
		}
		
			
		}
		
		

}
