package com.fngry.pelikan.sequence.exception;


public class SequenceException extends RuntimeException {


    public SequenceException(String message){
        super(message);
    }

    public SequenceException(String message, Throwable cause){
        super(message, cause);
    }

    public SequenceException(Throwable cause){
        super(cause);
    }

}
