package org.hson.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Hyun Woo Son on 8/31/18.
 */
@SpringBootApplication(scanBasePackages="org.hson")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
