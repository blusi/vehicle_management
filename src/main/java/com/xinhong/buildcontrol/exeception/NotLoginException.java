package com.xinhong.buildcontrol.exeception;

public class NotLoginException extends RuntimeException {

    public NotLoginException(String message) {
        super(message);
    }
}
