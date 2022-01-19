package com.javaacademy.model.impl;

import com.javaacademy.model.interfaces.Class06IPerson;

public abstract class Class06PersonImpl implements Class06IPerson {
    private String id;
    private String firstName;
    private String lastName;
    private String name;

    @Override
    public final boolean comparePerson(Class06PersonImpl person) {
        boolean matchFound = false;
        if (person.id.equals(this.id) ||
                (person.firstName.equals(this.firstName)
                        && person.lastName.equals(this.lastName))) {
            matchFound = true;
        }

        return matchFound;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
