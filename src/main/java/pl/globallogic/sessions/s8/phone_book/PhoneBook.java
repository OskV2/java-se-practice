package pl.globallogic.sessions.s8.phone_book;

import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.put(contact.fullName(), contact);
    }

    public Contact getContact(String lastName, String firstName) {
        String fullName = getFullName(lastName, firstName);
        return contacts.get(fullName);
    }

    public boolean removeContact(String lastName, String firstName) {
        String fullName = getFullName(lastName, firstName);
        if (contacts.containsKey(fullName)) {
            contacts.remove(fullName);
            return true;
        }
        return false;
    }

    public void listContacts() {
        System.out.println("Your contacts:");
        for (Map.Entry<String, Contact> contact : contacts.entrySet()) {
            System.out.println(contact.getValue());
        }
    }

    public boolean doesContactExist(String lastName, String firstName) {
        String fullName = getFullName(lastName, firstName);
        return contacts.containsKey(fullName) ? true : false;
    }

    private String getFullName(String lastName, String firstName) {
        return lastName + ", " + firstName;
    }
}
