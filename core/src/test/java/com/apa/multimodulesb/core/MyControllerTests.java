package com.apa.multimodulesb.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class MyControllerTests {

    @Autowired
    private MyController myController;

    @Test
    public void contextLoads() {
        assertThat(myController).isNotNull();
    }

    @Test
    public void testGetHelloPath() {
        assertThat(myController.getHelloPath("testGetHelloPath")).isNotBlank();
    }
}
