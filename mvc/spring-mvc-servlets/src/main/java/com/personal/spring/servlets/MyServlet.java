package com.personal.spring.servlets;

import com.personal.spring.controller.FormController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Hyun Woo Son on 6/19/18
 **/
public class MyServlet implements Servlet {

    private final Logger logger = LoggerFactory.getLogger(MyServlet.class);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        logger.info("called servlet");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
