package com.javaacademy.model;

//superclass/parent for Employee
public class Class04Person {
    private String id;
    private String firstName;
    private String lastName;
    private String name;

    //parameterized constructor
    public Class04Person(String id){
        this.id=id;
    }

    public Class04Person(String id, String firstName){
        this.id=id;
        this.firstName=firstName;
    }

    //getter-setter
    public String getId(){
        return this.id;
    }

    public String getName() {
        this.name = this.firstName + " " + this.lastName;
        return this.name;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void printDetails(String objName) {
        System.out.print("\n" + objName + ":- Person[Id: " + id);
        System.out.print("\tName: " + this.getName());
        System.out.print("]");
    }

    public boolean comparePeron(Class04Person person1) {
        boolean matchFound = false;
        if (person1.id.equals(this.id) ||
                (person1.firstName.equals(this.firstName) && person1.lastName.equals(this.lastName))) {
            matchFound = true;
        }

        return matchFound;
    }
}
