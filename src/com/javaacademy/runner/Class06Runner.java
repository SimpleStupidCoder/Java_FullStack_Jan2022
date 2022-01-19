package com.javaacademy.runner;

import com.javaacademy.model.impl.Class06EmployeeImpl;
import com.javaacademy.model.impl.Class06PersonImpl;
import com.javaacademy.model.impl.Class06ProfessorImpl;

public class Class06Runner {

    public static void main(String[] args) {
        Class06PersonImpl emp1=new Class06EmployeeImpl("001");
        Class06PersonImpl prof1=new Class06ProfessorImpl("002");


//       String empType = emp1.TYPE;
//       String profType = prof1.TYPE;

        Class06PersonImpl emp1Copy=((Class06EmployeeImpl) emp1).getDetails();

        if(emp1 instanceof Class06ProfessorImpl){
            System.out.println("Person IS-A Professor");
        }else{
            System.out.println("Person is not a Professor");
        }
    }
}
