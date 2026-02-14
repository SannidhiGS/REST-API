package com.xworkz.jersydemo.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

//@ApplicationPath("/api")
@ApplicationPath("/")
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig(){
        packages("com.xworkz.jersydemo.resource");
    }
}
