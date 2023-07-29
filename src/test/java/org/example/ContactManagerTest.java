package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void shouldCreateContact(){
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Kashaf", "Ashraf", "03048888909");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());

    }

    @AfterEach
    void tearDown() {
    }
}