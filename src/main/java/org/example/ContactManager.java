package org.example;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

    Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

    public void addContact(String firstName, String lastName, String phoneNumber){
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        validateContact(contact);
    }

    public Collection<Contact> getAllContacts(){

        return contactList.values();
    }

    public void validateContact(Contact contact){
        contact.validateFirstName();
        contact.validateLastName();
        contact.validatePhoneNumber();
    }

}