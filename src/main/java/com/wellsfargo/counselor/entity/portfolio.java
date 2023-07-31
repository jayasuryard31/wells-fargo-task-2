package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class portfolio {

    @Id
    @GeneratedValue()
    private long portfoloId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String creation_date;

    protected portfolio() {

    }

    public portfolio(String firstName, String lastName, String description, String creation_date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.creation_date = creation_date;
    }

    public Long getPortfolioId() {
        return portfoloId;
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

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public String getCD() {
        return creation_date;
    }

    public void setCD(String creation_date) {
        this.creation_date = creation_date;
    }
}
