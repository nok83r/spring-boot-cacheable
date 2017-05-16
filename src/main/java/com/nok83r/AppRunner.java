package com.nok83r;

import com.nok83r.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalTime;


/**
 * The type App runner.
 */
@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private UserRepository userRepository;

    @Autowired
    public AppRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        LocalTime before = LocalTime.now();
        logger.info(".... Fetching users");
        logger.info("user-1234 -->" + userRepository.getByUsername("user-1234"));
        logger.info("user-4567 -->" + userRepository.getByUsername("user-4567"));
        logger.info("user-1234 -->" + userRepository.getByUsername("user-1234"));
        logger.info("user-4567 -->" + userRepository.getByUsername("user-4567"));
        logger.info("user-1234 -->" + userRepository.getByUsername("user-1234"));
        logger.info("user-1234 -->" + userRepository.getByUsername("user-1234"));

        logger.info("Duration: " + Duration.between(before,LocalTime.now()).getSeconds() + " seconds");
    }
}
