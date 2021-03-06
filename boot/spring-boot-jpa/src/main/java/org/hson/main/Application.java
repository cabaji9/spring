package org.hson.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Hyun Woo Son on 8/31/18.
 */
@SpringBootApplication(scanBasePackages="org.hson")
@EnableJpaRepositories("org.hson.repository")
@EntityScan("org.hson.model")
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
