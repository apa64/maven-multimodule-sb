package com.apa.multimodulesb.service;

import org.springframework.stereotype.Service;

/**
 * Hello world service.
 */
@Service
public class MyService {
    public String getHello(String target) {
        return "Hello world from " + this.getClass().getName() + " to " + target;
    }
}
