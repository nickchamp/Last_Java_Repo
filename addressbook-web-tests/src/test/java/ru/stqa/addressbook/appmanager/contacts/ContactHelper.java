package ru.stqa.addressbook.appmanager.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);

    }

    public void returnToContactPage() {

        click(By.linkText("home page"));
    }

    public void submitContactCreation() {

        click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("email"), contactData.getEmail());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void initContactCreation() {

        click(By.linkText("add new"));
    }

    public void deleteSelectedContact() {

        click(By.cssSelector("#content > form:nth-child(3) > input:nth-child(2)"));
    }

    public void selectContact() {

        click(By.cssSelector("#maintable > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(8) > a:nth-child(1) > img:nth-child(1)"));
    }

    public void initContactModification() {

        click(By.cssSelector("#maintable > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(8) > a:nth-child(1) > img:nth-child(1)"));
    }

    public void submitContactModification() {

        click(By.cssSelector("#content > form:nth-child(2) > input:nth-child(86)"));
    }
}
