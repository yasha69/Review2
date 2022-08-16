package PracticeProb;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Contacts contacts1 = new Contacts("Yash Atkulwar", 21 ,935946385);
        int n =0;
        Scanner scan = new Scanner(System.in);
        addressBook.addContact(contacts1);
        while (n!=5){
            System.out.println("1.Add Contact \n2.Remove Contact"
                    + " \n3.Edit Contact \n4.Print all Contact \n5. Exit");
            n = scan.nextInt();
            switch (n){
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.removeContactByName();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.printAllContacts();
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid Selection ");
            }
        }
    }
}
