package com.personal.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Hyun Woo Son on 6/25/18
 **/
@ResponseStatus(value= HttpStatus.BAD_REQUEST,reason = "Last name not valid")
public class LastNameNotValidException extends RuntimeException {

    public LastNameNotValidException(String message) {
        super(message);
    }
}
