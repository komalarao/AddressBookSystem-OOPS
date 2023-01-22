package com.bridgelabz.addressBookSystems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBookCollection {
	static Map<String,AddressBook> addressBookMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void addNewAddressBook() {
        AddressBook addressBook=new AddressBook();
        System.out.println("Enter AddressBook Name :");
        String addressBookName = sc.next();
        if(checkAddressBook(addressBookName)) {
            System.out.println("Entered AddressBook is Already Available");
        } else {
            addressBookMap.put(addressBookName,addressBook);
        }
    }
    public static void displayAddressBooks() {
        for(String key: addressBookMap.keySet()){
            System.out.println(key);
        }
    }
    public static boolean checkAddressBook(String addressBookName) {
        for(String key: addressBookMap.keySet()){
            if(addressBookName.equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }
    public static void selectAddressBook() {
        displayAddressBooks();
        System.out.println("Enter AddressBook Name :");
        String addressBookName = sc.next();
        if(checkAddressBook(addressBookName)) {
            addressBookMap.get(addressBookName).contactOptions(addressBookMap.get(addressBookName));
        } else {
            System.out.println("Invalid AddressBook Name");
        }
    }
    public static void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the AddressBook Name :");
        String addressBookName = sc.next();
        if(checkAddressBook(addressBookName)) {
            addressBookMap.remove(addressBookName);
            System.out.println("AddressBook Deleted Successfully----!!");
        } else {
            System.out.println("Invalid AddressBook Name-----!!");
        }
    }
    public static final int userInput() {
        return sc.nextInt();
    }
}

