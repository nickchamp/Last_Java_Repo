package ru.stqa.addressbook.tests.contacts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.addressbook.appmanager.contacts.ContactManager;

public class BaseTest {

    protected final ContactManager app = new ContactManager();

    @BeforeMethod
    public void setUp() throws Exception {

        app.init();
    }

    @AfterMethod
    public void tearDown() {

        app.stop();
    }
}
