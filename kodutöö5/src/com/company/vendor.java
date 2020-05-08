package com.company;

public class vendor {
    private String name;
    private String address;
    private String repname;
    private int phoneNumb;

    public vendor(String name, String address, String contact, int phoneNumb) {
        this.name = name;
        this.address = address;
        this.repname = contact;
        this.phoneNumb = phoneNumb;
    }

    public vendor() {
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + repname + '\'' +
                ", phoneNumber=" + phoneNumb +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRepname(String contact) {
        this.repname = contact;
    }

    public void setPhoneNumb(int phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRepname() {
        return repname;
    }

    public int getPhoneNumb() {
        return phoneNumb;
    }
}