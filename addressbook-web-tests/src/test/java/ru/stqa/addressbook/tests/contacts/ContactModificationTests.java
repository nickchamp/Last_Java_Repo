package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.model.GroupData;

public class ContactModificationTests extends BaseTest {

    @Test
    public void testContactModification () {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "vpupkin@gmail.com", null));
        }
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Pasha", "Reopen", "test@do-it.co", null));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }
}
