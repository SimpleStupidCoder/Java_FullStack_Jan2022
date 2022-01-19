package com.javaacademy.runner;

import com.javaacademy.exception.Class07MyException;

public class Class07Runner {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        calculate();
        try {
            //nested-try
            try {
                //inputValidation(a, b);
                //TODO
            } catch (Class07MyException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
//      } catch (InputMismatchException e) {
//        System.out.println("Please correct your input as: " + e.getMessage());
//      }
            //will continue
            System.out.println(getResult(a, b));
        }
        //multiple-catch block
//    catch (InputMismatchException e){
//      System.out.println("Please correct your input as: " + e.getMessage());
//    }
        catch (ArithmeticException e) {
            System.out.println("Invalid arithmetic op as: " + e.getMessage());
        }
    }

    private static int getResult(int a, int b)
            throws ArithmeticException, Class07MyException //allowing method not to handle exception
    {
        return a / b;
    }

    private static void inputValidation(int a, int b) {
        if (a < 10 || b < 10) {
            //throwing an exception
            throw new Class07MyException("Numbers can't be less than 10");
            //throw new InputMismatchException("Numbers can't be negative");
        }

        System.out.println("Inputs are valid");
    }

    private static void calculate() {
        try {
            inputValidation(10, 9);
            int result = getResult(10, 9);
            System.out.println(result);
        } catch (Class07MyException | ArithmeticException e) {
            e.printStackTrace();
        } finally { //after try/catch block this will execute always
            System.out.println("I am done");
        }
    }
}
