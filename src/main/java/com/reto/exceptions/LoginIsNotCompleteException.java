package com.reto.exceptions;

public class LoginIsNotCompleteException  extends AssertionError{
    public static final String REGISTRO_FAIL_MESSAGE_EXCEPTION = "YOUR LOGIN WAS NOT SUCCESS";

    public LoginIsNotCompleteException(String mensaje, Throwable cause){
        super(mensaje, cause);
    }
}
