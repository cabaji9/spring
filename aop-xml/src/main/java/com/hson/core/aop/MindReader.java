package com.hson.core.aop;


import org.springframework.stereotype.Component;

/**
 * Created by Hyun Woo Son on 12/18/17
 **/

public interface MindReader {




    void interceptThoughts(String thoughts);

    String getThoughts();
}
