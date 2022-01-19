package com.javaacademy.exception;

public class Class07MyException extends RuntimeException {
    public Class07MyException(String msg){
        super(msg);
    }

    public Class07MyException(String msg, Throwable clause){
        super(msg,clause);
    }
}
