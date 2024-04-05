package org.example.model;

public class EmailAddress {

    private String emailAddress;
    private String label;

    public EmailAddress(String emailAddress, String label) {
        this.emailAddress = emailAddress;
        this.label = label;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "emailAddress='" + emailAddress + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
