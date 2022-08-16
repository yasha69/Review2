package PracticeProb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    Scanner scan = new Scanner(System.in);
    private List<Contacts> contactList = new  ArrayList<>();

    public void addContact(Contacts contacts) {
        contactList.add(contacts);
    }

    public void addNewContact() {
        System.out.println("Enter the details to Add :");
        System.out.println("Enter Name");
        String name = scan.nextLine();
        System.out.println("Enter Age");
        int age = scan.nextInt();
        System.out.println("Enter Phone Number");
        long phoneNo = scan.nextLong();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();

        Contacts contacts = new Contacts(name,age,phoneNo,city,state);
        contactList.add(contacts);
    }

    public List getList() {
        return contactList;
    }

    public void printAllContacts() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));

        }
    }


    public Contacts removeContactByName() {
        System.out.println("Enter Name of Contact to delete");
        String name = scan.nextLine();
        for(Contacts contacts :contactList) {
            if(contacts.name.equals(name)) {
                contactList.remove(contacts);
                return null;
            }
        }
        return null;
    }


    public Contacts editContact() {
        System.out.println("Enter name of contact to Edit");
        String name = scan.nextLine();
        for(Contacts contacts :contactList) {
            if(contacts.name.equals(name)) {
                System.out.println(contacts);
                System.out.println("Enter what you want to edit \n1.Name \n2.Age"
                        + " \n3.Phone Number \n4.City \n5.State");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the new name");
                        String newFirstName = scan.next();
                        contacts.name = newFirstName;
                        break;

                    case 2:
                        System.out.println("Enter the new Age");
                        int newAge = scan.nextInt();
                        contacts.age = newAge;
                        break;

                    case 3:
                        System.out.println("Enter the new phone number");
                        long newPhone = scan.nextLong();
                        contacts.phoneNo = newPhone;
                        break;

                    case 4:
                        System.out.println("Enter the new City");
                        String newCity = scan.next();
                        contacts.city = newCity;
                        break;

                    case 5:
                        System.out.println("Enter the new State");
                        String newState = scan.next();
                        contacts.state = newState;
                        break;

                    default:
                        break;
                }
                return null;
            }
        }
        return null;
    }

}
