package ru.stqa.addressbook.appmanager.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
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
    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("email"), contactData.getEmail());
    }
    public void initContactCreation() {

        click(By.linkText("add new"));
    }

    public void deleteSelectedContact() {

        click(By.name("delete"));
    }

    public void selectContact() {

        click(By.name("selected[]"));
    }

    public void initContactModification() {

        click(By.name("edit"));
    }

    public void submitContactModification() {

        click(By.name("update"));
    }
}
