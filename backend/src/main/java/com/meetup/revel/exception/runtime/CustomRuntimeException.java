package com.meetup.revel.exception.runtime;

public class CustomRuntimeException extends RuntimeException{

    public CustomRuntimeException(String s) {
        super(s);
    }

    public CustomRuntimeException(Exception e) {
        super(e);
    }
}
