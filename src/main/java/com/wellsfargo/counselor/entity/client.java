package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String contactInfo;

    protected client() {

    }

    public client(String firstName, String lastName, String contact_info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contact_info;
    }

    public Long getClientId() {
        return clientId;
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

    public String getCntc() {
        return contactInfo;
    }

    public void setCntc(String contactinfo) {
        this.contactInfo = contactinfo;
    }
}
