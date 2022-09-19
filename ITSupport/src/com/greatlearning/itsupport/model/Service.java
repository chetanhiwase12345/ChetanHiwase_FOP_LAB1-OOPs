package com.greatlearning.itsupport.model;
import java.util.Random;
public class Service {
	public String generateEmailID(String firstName, String lastName, String department)
	{
		return firstName.concat(lastName)+"@"+department+".greatlearning.com";
	}
	public char[] generatePassword()
	{
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharecter="@£$%&*?";
		String values = capitalLetters.concat(smallLetters).concat(specialCharecter).concat(numbers);
		Random ranomNumber = new Random();
		char[] password = new char[8];
		for(int i=0; i<8; i++)
		{
			password[i] =values.charAt(ranomNumber.nextInt(values.length()));
		}
		return password;		
	}
	public void showCredentials(Empolyee empolyee, String email, char[] genratedPassword)
	{
		System.out.println("Dear "+empolyee.getFirstName()+" your generated credentials are as follows ");
		System.out.println("Email --> " +  email);
		System.out.print("Password --> ");
		System.out.println(genratedPassword);
	}
}
