package org.premanshuray.cakebakeryapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CakebakeryApplication implements CommandLineRunner {

    public CakebakeryApplication(Frosting frosting , Syrup syrup) {
        CakeBaker cakeBaker = new CakeBaker(frosting,syrup);
        cakeBaker.bakeCake();

    }

    public static void main(String[] args) {
        SpringApplication.run(CakebakeryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
