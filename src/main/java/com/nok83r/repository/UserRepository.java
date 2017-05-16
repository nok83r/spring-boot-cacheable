package com.nok83r.repository;


import com.nok83r.domain.User;

/**
 * The type User repository.
 */
public interface UserRepository {

    User getByUsername(String username);

}
