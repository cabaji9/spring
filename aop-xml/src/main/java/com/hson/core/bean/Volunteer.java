package com.hson.core.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 12/18/17
 **/
@Component
public class Volunteer implements Thinker {


    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }


    public String getThoughts() {
        return thoughts;
    }
}
