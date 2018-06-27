package com.personal.spring.configuration;

import com.personal.spring.filters.MyFilter;
import com.personal.spring.servlets.MyServlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Hyun Woo Son on 6/19/18
 **/
public class FilterInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {


        servletContext.addFilter("myFilter", MyFilter.class).
                addMappingForUrlPatterns(null,false,"/");
    }
}
