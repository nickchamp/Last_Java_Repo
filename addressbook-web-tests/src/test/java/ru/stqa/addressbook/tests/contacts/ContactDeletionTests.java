package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactDeletionTests extends BaseTest {

    @Test
    public void testContactDeletion() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "vpupkin@gmail.com", null));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().returnToContactPage();
    }
}
