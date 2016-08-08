//version 7c
public class Main {	
	
	public static void main(String[] args) {
		String fullName = "Donald Duck";
		System.out.println(getFirstName(fullName));
		System.out.println(getSurname(fullName));
		System.out.println("This was programmed using functions with return!");
	}
	
	public static String getFirstName(String fullName) {
		int spacePosition = fullName.indexOf(" ");
		String firstName = fullName.substring(0,spacePosition);
		return ("First Name: " + firstName);		
	}
	
	public static String getSurname(String fullName) {
		int spacePosition = fullName.indexOf(" ");
		String surName = fullName.substring(spacePosition+1);
		return ("Surname: " + surName);

	}
}
		
	

//version a is all in one block
//version b has functions
//version c has functions that use return
//version d has main class and nameManager class
