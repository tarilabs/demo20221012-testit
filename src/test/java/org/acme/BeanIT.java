package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest // demonstrating the problem of classloading.
public class BeanIT {

    @Inject
    HelloBean helloBean;

    @Test
    public void testShouldHaveBeenUnitTest() {
        assertEquals("Hello, John", helloBean.sayHello("John"));
    }
}
