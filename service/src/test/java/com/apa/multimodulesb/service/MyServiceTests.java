package com.apa.multimodulesb.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple Service. Note: classes is required in the annotation
 * because the class under test is just a @Service and there is no configuration
 * class(eg. with @SpringBootApplication) in the package hierarchy.
 */
@SpringBootTest(classes = { MyService.class })
public class MyServiceTests {
    @Autowired
    private MyService myService;

    @Test
    public void contextLoads() throws Exception {
        assertThat(myService).isNotNull();
    }

    @Test
    public void testGetHello() {
        String result = myService.getHello("testGetHello()");
        assertThat(result).isNotNull();
    }
}
