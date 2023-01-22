package com.bridgelabz.addressBookSystems;
import java.util.Scanner;
public class AddressBookMain {
		public static void main(String[] args) {
			System.out.println("Welcome To Address Book"); // print welcome massage
			AddressBook addressBook = new AddressBook();
			Scanner scanner = new Scanner(System.in); // Create object
			// Initialize
			int Number;

			/**
			 * Enter number 1 to add this contacts details Enter number 2 to displaying
			 * contact details Enter number 3 to Editing contacts details
			 */
			do {
				System.out.println("1. Add Contact \n2. Display contact \n3.EDIT CONTACT");
				System.out.println("Enter the Number: ");
				Number = scanner.nextInt();

				switch (Number) {

				case 1:
					addressBook.addContact();
					break;
				case 2:
					addressBook.showContacts();
					break;
				case 3:
					addressBook.editContact();
					break;
				default:
					System.out.println(" !!!Invalid Input!!! ");
					break;

				}
			} while (Number < 4); // calling
		}

}
