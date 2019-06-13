import java.util.Scanner;

public class Ch02_prj1_StudentRegistration {

	public static void main(String[] args) {
		
		// Welcome
			System.out.println("Student Registration Form");
			
			Scanner sc = new Scanner(System.in);


			// Prompt
				System.out.println("Enter first name: ");
				String firstname = sc.next();
				System.out.println("Enter last name: ");
				String lastname = sc.next();
				System.out.println("Enter year of birth: ");
				int birthYear = sc.nextInt();
				
					
			//Bus Logic
				String fullname = firstname + " " + lastname;
	
	
			//Display Results
				System.out.println("Welcome " + firstname + " " + lastname + "!");
				System.out.println("Your registration is complete.");
				System.out.println("Your temporary password is " + firstname + "*" + birthYear);
					
			
		// Bye
			System.out.println("");
			System.out.println("Congratulations!");
				
	}

}
