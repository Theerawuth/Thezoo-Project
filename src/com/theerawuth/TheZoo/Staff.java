package com.theerawuth.TheZoo;


public class Staff {


    protected   String role;
    protected   String IDStaff;
    protected  String firstName;
    protected  String lastName;
    protected String feed;

    public Staff(String IDStaff, String role, String firstName, String lastName, String feed) {
        this.role = role;
        this.IDStaff = IDStaff;
        this.firstName = firstName;
        this.lastName = lastName;
        this.feed = feed;
    }

    public Staff(String IDStaff, String role, String firstName, String lastName) {
        this.IDStaff = IDStaff;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFeed() {
        return feed;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getIDStaff() {
        return IDStaff;
    }

    public void setIDStaff(String IDStaff) {
        this.IDStaff = IDStaff;
    }


}



