package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.Test;

public class ContactDeletionTests extends BaseTest {

    @Test
    public void testContactDeletion() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().returnToContactPage();
    }
}
