package me.moderator_man.meridian.serial.example;

import me.moderator_man.meridian.serial.FormatReader;
import me.moderator_man.meridian.serial.FormatWriter;

public class Main
{
	public static void main(String[] args)
	{
		// define the object you want to serialize (class must implement Serializable)
		Person person = new Person("Eleanor", "Rigby", 80);
		
		// this one should be self explanatory
		String path = "beatles.character";
		
		// you can write your object to the file using the FormatWriter (make sure you specify the type)
		FormatWriter<Person> writer = new FormatWriter<Person>();
		writer.write(person, path);
		
		// you can then read the file back using the FormatReader (again, specify the type)
		FormatReader<Person> reader = new FormatReader<Person>();
		Person pfd = reader.read(path);
		
		System.out.println("First name: " + pfd.firstName);
		System.out.println("Last name: " + pfd.lastName);
		System.out.println("Age: " + pfd.age);
		
		/*
		 * Output should look like this:
		 * 
		 * First name: Eleanor
		 * Last name: Rigby
		 * Age: 80
		 * 
		 * Shout out to any Beatles fans who see this.
		 */
	}
}
