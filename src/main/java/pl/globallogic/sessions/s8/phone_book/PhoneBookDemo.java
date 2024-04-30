package pl.globallogic.sessions.s8.phone_book;

import java.util.HashMap;

public class PhoneBookDemo {

    //  Create a new phone book
    //  Add contact to phone book
    //  List content of phone book
    //  Get a contact from phone book
    //  Remove a contact from phone book

    public static void main(String[] args) {

        //  Create a new phone book
        PhoneBook ourBook = new PhoneBook(new HashMap<>());

        //  Add contact to phone book
        Contact alice = new Contact("Alice", "Smith", "123 456 789");
        Contact bob = new Contact("Bob", "Doe", "404 505 606");
        Contact charlie = new Contact("Charlie", "Johnson", "234 567 890");
        Contact lucy = new Contact("Lucy", "Lamb", "555 555 555");

        ourBook.addContact(alice);
        ourBook.addContact(bob);
        ourBook.addContact(charlie);
        ourBook.addContact(lucy);

        //  List content of phone book
        ourBook.listContacts();

        //  Remove a contact from phone book
        ourBook.removeContact("Doe", "Bob");
        System.out.println("Do we have 'Doe, Bob' in our book?: " + ourBook.doesContactExist("Doe", "Bob"));

        //  Get a contact from phone book
        System.out.println("Contact of 'Smith, Alice' -> " + ourBook.getContact("Smith", "Alice"));

    }
}
