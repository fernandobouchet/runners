package com.fernandobouchet.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner runner(RunRepository runRepository) {
//        return args -> {
//            Run run = new Run(6, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(3, ChronoUnit.HOURS), 3, Location.OUTDOOR);
//            runRepository.create(run);
//        };
//    }
}
