package ru.stqa.addressbook.appmanager.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationContactHelper extends BaseHelper {

    public NavigationContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void gotoContactCreationPage () {
        click(By.linkText("add new"));
    }
}
