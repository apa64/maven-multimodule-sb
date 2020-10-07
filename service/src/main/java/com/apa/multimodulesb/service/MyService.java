package com.apa.multimodulesb.service;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world service.
 */
@Service
public class MyService {

    private Logger logger = LoggerFactory.getLogger(MyService.class);

    public String getHello(String target) {
        logger.debug("MyService.getHello() target = " + target);
        return "Hello world from " + this.getClass().getName() + " to " + target;
    }
}
