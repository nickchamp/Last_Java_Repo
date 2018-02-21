package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTests extends BaseTest {

    @Test
    public void testContactCreation () {
        app.getNavigationContactHelper().gotoContactCreationPage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Vasya", "Pupkin", "vpupkin@mail.ua", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactPage();
    }
}

