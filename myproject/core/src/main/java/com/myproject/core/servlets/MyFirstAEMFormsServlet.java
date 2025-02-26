package com.myproject.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import java.io.IOException;

@Component(service = {Servlet.class}, property = {"sling.servlet.method=GET", "sling.servlet.paths=/bin/Getdata"})
public class MyFirstAEMFormsServlet extends SlingAllMethodsServlet {


    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
response.getWriter().print("HELLO");
    }

}
