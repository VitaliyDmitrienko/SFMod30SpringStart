package org.example.entity;

public class Student {
    private static long id;
    private static String firstName;
    private static String lastName;

    public static long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
