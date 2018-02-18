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

        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void selectContact() {

        click(By.xpath("//div/div[4]/form[2]/table/tbody/tr[3]/td[1]/input"));
    }

    public void initContactModification() {

        click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
    }

    public void submitContactModification() {

        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }
}
