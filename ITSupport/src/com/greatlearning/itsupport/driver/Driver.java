package com.greatlearning.itsupport.driver;
import java.util.Scanner;
import com.greatlearning.itsupport.model.Empolyee;
import com.greatlearning.itsupport.model.Service;
public class Driver {
	public static void main(String[] args)
	{
		Empolyee employee= new Empolyee("chetan", "Hiwase");
		Service service = new Service();
		String generateEmail;
		char[] generatedPassword;		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
		case 1:
			generateEmail = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			generatedPassword= service.generatePassword();
			service.showCredentials(employee, generateEmail, generatedPassword);
			break;
		case 2:
			generateEmail = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "adm");
			generatedPassword= service.generatePassword();
			service.showCredentials(employee, generateEmail, generatedPassword);
			break;
		case 3:
			generateEmail = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			generatedPassword= service.generatePassword();
			service.showCredentials(employee, generateEmail, generatedPassword);
			break;
		case 4:
			generateEmail = service.generateEmailID(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "lg");
			generatedPassword= service.generatePassword();
			service.showCredentials(employee, generateEmail, generatedPassword);
		}
	}
}
