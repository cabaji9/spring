package com.personal.spring.exception;

import java.text.MessageFormat;

/**
 * Created by Hyun Woo Son on 8/21/18.
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String msg){
        super(msg,null,false,false);
    }

    public UserNotFoundException(String msg, Object ...vars){
        super(MessageFormat.format(msg,vars),null,false,false);
    }
}
