package com.tutorial.application.tutorial;

import jakarta.persistence.*;

@Entity
@SecondaryTable(name = "additional_customer_details")
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_number", length = 10)
    private String mobileNumber;

    @Column(name = "pan_number", length = 15, table = "additional_customer_details")
    private String panNumber;

    @Column(name = "amazon_pay_account_id", table = "additional_customer_details")
    private Long amazonPayAccountId;

    @Column(name = "debit_card_number", table = "additional_customer_details")
    private Long debitCardNumber;

    public Long getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(Long debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    public Long getAmazonPayAccountId() {
        return amazonPayAccountId;
    }

    public void setAmazonPayAccountId(Long amazonPayAccountId) {
        this.amazonPayAccountId = amazonPayAccountId;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}