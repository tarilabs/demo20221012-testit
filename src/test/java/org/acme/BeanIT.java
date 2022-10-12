package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest // demonstrating the problem of classloading.
public class BeanIT { // let's say I inadvertently named this ending with IT...

    @Inject
    HelloBean helloBean;

    @Test
    public void testShouldHaveBeenUnitTest() {
        assertEquals("Hello, John", helloBean.sayHello("John"));
    }
}
