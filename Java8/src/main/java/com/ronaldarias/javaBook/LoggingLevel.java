package com.ronaldarias.javaBook;

public enum LoggingLevel {
    PENDING(1), PROCESSING(2), PROCESSED(3);

    private int i;

    /*
    * Con el constructor privado no esta permitido
    * crear nuevos values en el ENUM
    * */
    private LoggingLevel(int i) {
        this.i = i;
    }
}
