package com.personal.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Created by Hyun Woo Son on 1/23/18
 **/
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Value("${upload.dir}")
    private String uploadDir;

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }


    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

        registration.setMultipartConfig(new MultipartConfigElement(uploadDir));
    }
}
