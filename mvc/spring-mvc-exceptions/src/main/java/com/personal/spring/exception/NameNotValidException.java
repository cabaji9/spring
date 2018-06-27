package com.personal.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Hyun Woo Son on 6/25/18
 **/
@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason = "Name not valid")
public class NameNotValidException extends RuntimeException {

    public NameNotValidException(String message) {
        super(message);
    }
}
