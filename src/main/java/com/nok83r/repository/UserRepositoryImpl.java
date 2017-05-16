package com.nok83r.repository;

import com.nok83r.domain.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * The type User repository.
 */
@Component
public class UserRepositoryImpl implements UserRepository {


    @Override
    @Cacheable("users")
    public User getByUsername(String username) {
        simulateSlowService();
        return new User(1, username, "XXX XXX");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
