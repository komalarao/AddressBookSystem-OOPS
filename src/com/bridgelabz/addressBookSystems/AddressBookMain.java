package com.bridgelabz.addressBookSystems;
import java.util.Scanner;
public class AddressBookMain {
	public static void main(String[] args) {
        System.out.println("--------Welcome to Address Book Program-------");
        int choice;
        do {
            System.out.println("1. Add New AddressBook \n2. Delete AddressBook" + "\n3. Display AddressBook\n4. Add Contact\n5. Exit");
            System.out.println("Enter Choice: ");
            choice = AddressBookCollection.userInput();

            switch (choice) {
                case 1:
                	AddressBookCollection.addNewAddressBook();  //Add Address Book
                    break;
                case 2:
                	AddressBookCollection.deleteAddressBook();   //Delete Address Book
                    break;
                case 3:
                	AddressBookCollection.displayAddressBooks();  //Display Address Book
                    break;
                case 4:
                	AddressBookCollection.selectAddressBook();     //Select Address Book
                    break;
                case 5:
                    System.out.println("Thank You for Using Address Book.");
                    break;
                default:
                    System.out.println("Please Select between 1 to 6 only.");
                    break;
            }
        }
        while( choice !=5 );
    }
}
