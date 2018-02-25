package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTests extends BaseTest {

    @Test
    public void testContactCreation () {
        app.getNavigationContactHelper().gotoContactCreationPage();
        app.getContactHelper().createContact(new ContactData("Vasya", "Pupkin", "vpupkin@gmail.com", "test1"));
    }
}

