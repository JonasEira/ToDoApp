package org.todoapp;

public class Person {
    String firstName;
    int id;
    String lastName;
    String email;

    public int getId() {
        return id;
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSummary() {
        return "Person {" + "firstName='" + firstName
                + '\'' + ", id=" + id + ", lastName='" + lastName
                + '\'' + ", email='" + email
                + '\''
                + '}';
    }
}
