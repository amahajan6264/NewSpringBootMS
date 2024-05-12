package com.ak;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

public class MyAppInitializer implements WebApplicationInitializer {


	@Override
	public void onStartup(jakarta.servlet.ServletContext servletContext) throws jakarta.servlet.ServletException {
		// TODO Auto-generated method stub
		 // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(WebConfig.class);

        // Create and configure the DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(rootContext);
        ServletRegistration.Dynamic registration = (Dynamic) servletContext.addServlet("dispatcher", DispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
	}

	
}
