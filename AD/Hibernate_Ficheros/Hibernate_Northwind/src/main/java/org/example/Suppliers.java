package org.example;

import java.io.Serializable;

public class Suppliers implements Serializable {


    private int SupplierID;
    private String CompanyName;
    private String ContactName ;
    private String ContactTitle;
    private String Address ;
    private String City ;
    private String Region;
    private String PostalCode ;
    private String Country;
    private String Phone ;
    private String Fax;
    private String HomePage ;

    public Suppliers() {
    }

    public Suppliers(int supplierID, String companyName, String contactName, String contactTitle, String adress, String city, String region, String postalCode, String country, String phone, String fax, String homePage) {
        SupplierID = supplierID;
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Address = adress;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
        HomePage = homePage;
    }


    public Suppliers(String companyName, String contactName, String contactTitle, String address, String city, String region, String postalCode, String country, String phone, String fax, String homePage) {
        CompanyName = companyName;
        ContactName = contactName;
        ContactTitle = contactTitle;
        Address = address;
        City = city;
        Region = region;
        PostalCode = postalCode;
        Country = country;
        Phone = phone;
        Fax = fax;
        HomePage = homePage;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getContactTitle() {
        return ContactTitle;
    }

    public void setContactTitle(String contactTitle) {
        ContactTitle = contactTitle;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String homePage) {
        HomePage = homePage;
    }


    @Override
    public String toString() {
        return "Suppliers{" +
                "SupplierID=" + SupplierID +
                ", CompanyName='" + CompanyName + '\'' +
                ", ContactName='" + ContactName + '\'' +
                ", ContactTitle='" + ContactTitle + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Region='" + Region + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                ", Country='" + Country + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Fax='" + Fax + '\'' +
                ", HomePage='" + HomePage + '\'' +
                '}';
    }
}
