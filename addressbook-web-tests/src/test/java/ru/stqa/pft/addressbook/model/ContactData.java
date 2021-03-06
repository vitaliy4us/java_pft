package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String company;
    private final String title;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homePage;
    private final String group;
    private final String secondaryAddress;
    private final String secondaryHome;
    private final String notes;

    public ContactData(String firstName, String middleName, String lastName, String nickName, String company,
                       String title, String address, String home, String mobile, String work, String fax,
                       String email, String email2, String email3, String homePage, String group,
                       String secondaryAddress, String secondaryHome, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homePage = homePage;
        this.group = group;
        this.secondaryAddress = secondaryAddress;
        this.secondaryHome = secondaryHome;
        this.notes = notes;
    }

    public String getFirstName() {return firstName;}
    public String getMiddleName() {return middleName;}
    public String getLastName() {return lastName;}
    public String getNickName() {return nickName;}
    public String getTitle() {return title;}
    public String getCompany() {return company;}
    public String getAddress() {return address;}
    public String getHome() {return home;}
    public String getMobile() {return mobile;}
    public String getWork() {return work;}
    public String getFax() {return fax;}
    public String getEmail() {return email;}
    public String getEmail2() {return email2;}
    public String getEmail3() {return email3;}
    public String getHomePage() {return homePage;}
    public String getGroup() {return group;}
    public String getSecondaryAddress() {return secondaryAddress;}
    public String getSecondaryHome() {return secondaryHome;}
    public String getNotes() {return notes;}

}

