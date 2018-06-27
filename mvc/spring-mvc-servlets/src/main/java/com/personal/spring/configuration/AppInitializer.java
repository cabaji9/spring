package com.personal.spring.configuration;

import com.personal.spring.filters.MyFilterDispatcher;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by Hyun Woo Son on 1/23/18
 **/
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

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
    protected Filter[] getServletFilters() {
        return new Filter[]{new MyFilterDispatcher()};
    }
}
