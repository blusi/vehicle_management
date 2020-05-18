package com.xinhong.buildcontrol.exeception;

public class AlreadyRegisterException extends RuntimeException {

    public AlreadyRegisterException(String message) {
        super(message);
    }
}
