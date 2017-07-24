package com.ankitmg.testApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by iankitgupta on 7/22/2017.
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Override
    public void run(String[] args) {
        System.out.println("***********************Booting Up **********************");
    }


    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
