package com.apa.multimodulesb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.apa.multimodulesb.service.MyService;

/**
 * Core application class.
 */
@SpringBootApplication
public class Main {
    /** unused because there's no logic in main */
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("main() finished");
    }
}
