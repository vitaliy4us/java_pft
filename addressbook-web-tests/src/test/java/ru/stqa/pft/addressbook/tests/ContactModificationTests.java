package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactCreation() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("FIRST NAME1", "MIDDLE NAME1",
                "LAST NAME1", "NICK NAME1", "COMPANY1", "TITLE1", "ADDRESS1",
                "HOME1", "MOBILE1", "WORK1", "FAX1", "EMAIL_1", "EMAIL2_1",
                "EMAIL3_1", "HOMEPAGE1", null,"SECONDARY ADDRESS1",
                "SECONDARY HOME1", "NOTES1"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().goToHomePage();
    }
}
