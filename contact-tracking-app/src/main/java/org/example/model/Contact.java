package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<EmailAddress> emailAddressList;
    private List<PhoneNumber> phoneNumberList;


    public Contact(){}

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.emailAddressList = new ArrayList<>();
        this.phoneNumberList = new ArrayList<>();
    }

    public Contact(String firstName, String lastName, String company, String jobTitle,
                   List<EmailAddress> emailAddressList, List<PhoneNumber> phoneNumberList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.emailAddressList = emailAddressList;
        this.phoneNumberList = phoneNumberList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<EmailAddress> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailAddress> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public List<PhoneNumber> getPhoneNumberList() {
        return phoneNumberList;
    }

    public void setPhoneNumberList(List<PhoneNumber> phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", emailAddressList=" + emailAddressList +
                ", phoneNumberList=" + phoneNumberList +
                '}';
    }
}
