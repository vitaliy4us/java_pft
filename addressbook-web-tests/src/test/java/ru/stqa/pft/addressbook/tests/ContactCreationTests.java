package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("FIRST NAME", "MIDDLE NAME",
                "LAST NAME", "NICK NAME", "TITLE", "COMPANY", "ADDRESS",
                "HOME", "MOBILE", "WORK", "FAX", "EMAIL", "EMAIL2",
                "EMAIL3", "HOMEPAGE", "SECONDARY ADDRESS",
                "SECONDARY HOME", "NOTES"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}

