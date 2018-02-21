package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactModificationTests extends BaseTest {

    @Test
    public void testContactModification () {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Pasha", "Reopen", "test@do-it.co", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }
}
