package com.nok83r.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The type User.
 */
@Data
@AllArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String fullname;

}
