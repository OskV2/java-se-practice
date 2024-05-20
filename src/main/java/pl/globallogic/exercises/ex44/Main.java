package pl.globallogic.exercises.ex44;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        // Adding contacts
        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);
        mobilePhone.addNewContact(tom);

        // Printing contacts
        mobilePhone.printContacts();

        // Finding contacts
        Contact foundContact = mobilePhone.queryContact("Bob");
        if (foundContact != null) {
            System.out.println("Found contact: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }

        // Updating contact
        Contact newBob = Contact.createContact("Bobby", "98765432");
        boolean updated = mobilePhone.updateContact(bob, newBob);
        if (updated) {
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Failed to update contact.");
        }

        // Removing contact
        boolean removed = mobilePhone.removeContact(alice);
        if (removed) {
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Failed to remove contact.");
        }

        // Printing contacts after modifications
        mobilePhone.printContacts();
    }
}
