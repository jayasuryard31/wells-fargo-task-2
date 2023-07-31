package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class securities {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchase_date;

    @Column(nullable = false)
    private String purchase_price;

    @Column(nullable = false)
    private String quantity;

    protected securities() {

    }

    public securities(String firstName, String lastName, String category, String purchase_date, String purchase_price,String quantity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPD() {
        return purchase_date;
    }

    public void setPD(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getPC() {
        return purchase_price;
    }
    
    public void setPP(String purchase_price) {
        this.purchase_price = purchase_price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
