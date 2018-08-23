package com.personal.spring.exception;

import com.personal.spring.model.ErrorRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by Hyun Woo Son on 8/21/18.
 */
@ControllerAdvice
public class ExceptionRestHandler {


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorRest> obtainError(UserNotFoundException user){
        ErrorRest errorRest = new ErrorRest();
        errorRest.setMsg(user.getMessage());
        return new ResponseEntity<>(errorRest, HttpStatus.BAD_REQUEST);
    }

}
