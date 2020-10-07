package com.apa.multimodulesb.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.apa.multimodulesb.service.MyService;

/**
 * Core application class.
 */
@SpringBootApplication(scanBasePackages = "com.apa.multimodulesb")
@RestController
@RequestMapping("/api")
public class MyController {
    @Autowired
    private MyService myService;

    private Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/hellopath/{target}")
    public String getHelloPath(@PathVariable String target) {
        logger.debug("Saying hi from /hellopath/{" + target + "}");
        return myService.getHello(target);
    }

    @GetMapping("/helloquery")
    public String getHelloQuery(@RequestParam("target") String target) {
        logger.debug("Saying hi from /helloquery/?target=" + target);
        return myService.getHello(target);
    }

    @GetMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Check out the logs to see all levels";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyController.class, args);
    }
}
