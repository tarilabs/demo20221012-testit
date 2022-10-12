package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloBean {
    
    public String sayHello(String name) {
        return "Hello, "+name;
    }
}
