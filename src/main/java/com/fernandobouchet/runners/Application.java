package com.fernandobouchet.runners;

import com.fernandobouchet.runners.run.Location;
import com.fernandobouchet.runners.run.Run;
import com.fernandobouchet.runners.run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner runner(RunRepository runRepository) {
        return args -> {
            Run run = new Run(6, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(3, ChronoUnit.HOURS), 3, Location.OUTDOOR);
            runRepository.create(run);
        };
    }
}
