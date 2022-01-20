package com.javaacademy.model.interfaces;
import com.javaacademy.model.impl.Class06PersonImpl;

public interface Class06IPerson {
    boolean comparePerson(Class06PersonImpl person);
    void printDetails();

    //nested interface
    interface Message{
        void printMessage();
    }

}
