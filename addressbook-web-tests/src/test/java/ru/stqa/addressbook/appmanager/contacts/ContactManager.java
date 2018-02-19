package ru.stqa.addressbook.appmanager.contacts;

import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class ContactManager {
    FirefoxDriver wd;

    private SessionContactHelper sessionContactHelper;
    private NavigationContactHelper navigationContactHelper;
    private ContactHelper contactHelper;

    public void init() {
        System.setProperty("webdriver.gecko.driver", "C:\\\\gecko\\geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook");
        contactHelper = new ContactHelper(wd);
        navigationContactHelper = new NavigationContactHelper(wd);
        sessionContactHelper = new SessionContactHelper(wd);
        sessionContactHelper.login("admin", "secret");
    }

    public void stop() {

        wd.quit();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationContactHelper getNavigationContactHelper() {
        return navigationContactHelper;
    }
}
