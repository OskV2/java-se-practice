package pl.globallogic.exercises.ex44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact c) {
        if(!myContacts.contains(c)) {
            myContacts.add(c);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = myContacts.indexOf(oldContact);
        if (oldContactIndex == -1) return false;

        myContacts.set(oldContactIndex, newContact); // replace old contact with new one
        return true;
    }

    public boolean removeContact(Contact c) {
        if (!myContacts.contains(c)) return false;

        int contactIndex = 0;

        for (int i = 0; i < myContacts.size(); i++) {
            if (c == myContacts.get(i)) contactIndex = i;
        }

        myContacts.remove(contactIndex);
        return true;
    }

    public int findContact(Contact c) {
        if (!myContacts.contains(c)) return -1;

        int contactIndex = 0;

        for (int i = 0; i < myContacts.size(); i++) {
            if (c == myContacts.get(i)) contactIndex = i;
        }

        return contactIndex;
    }

    public int findContact(String phoneNumber) {
        int contactIndex = -1;

        for (int i = 0; i < myContacts.size(); i++) {
            if (phoneNumber == myContacts.get(i).getPhoneNumber()) contactIndex = i;
        }

        return contactIndex;
    }

    public Contact queryContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (name == myContacts.get(i).getName()) return myContacts.get(i);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact list: ");
        for (int i = 0; i < myContacts.size(); i++) System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
    }
}
