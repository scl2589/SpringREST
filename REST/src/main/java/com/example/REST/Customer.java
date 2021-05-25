package com.example.REST;

public class Customer {
    private Integer id;
    private String membership;
    private String custName;
    private String custAddress;

    public Customer(Integer id, String membership, String custName, String custAddress) {
        this.membership = membership;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
}
