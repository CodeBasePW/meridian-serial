package me.moderator_man.meridian.serial.example;

import java.io.Serializable;

public class Person implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public String firstName;
	public String lastName;
	public int age;
	
	public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
}
