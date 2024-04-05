package org.example;

import org.example.model.Contact;
import org.example.model.EmailAddress;
import org.example.model.PhoneNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Contact 1
        PhoneNumber p1 = new PhoneNumber("240-133-0011", "Home");
        PhoneNumber p2 = new PhoneNumber("240-112-0123", "Mobile");

        EmailAddress e1 = new EmailAddress("dave.sang@gmail.com", "Home");
        EmailAddress e2 = new EmailAddress("dsanger@argos.com", "Work");

        Contact c1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                List.of(e1, e2), List.of(p1, p2));


        //Contact 2
        Contact c2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");

        //Contact 3
        Contact c3 = new Contact("Ali ","Gafar","BMI Services", "HR Manager",
                List.of(new EmailAddress("ali@bmi.com", "Work")),
                List.of(new PhoneNumber("412-116-9988", "Work")));


        Contact[] contacts = {c1, c2, c3};
        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));
        System.out.println("========= Contacts Data ========");
        printInJson(contacts);
    }


    private static void printInJson(Contact[] contacts) {

        for(Contact c : contacts) {

            System.out.println((String.format("{\"firstName\": \"%s\", \"lastName\": \"%s\", \"company\": \"%s\", \"jobTitle\": \"%s\", " +
                            "\"phoneNumbers\": \"%s\" \"emailAddresses\": \"%s\"",
                    c.getFirstName(), c.getLastName(), c.getCompany(), c.getJobTitle(), c.getPhoneNumberList(),c.getEmailAddressList())));
        }


    }
}