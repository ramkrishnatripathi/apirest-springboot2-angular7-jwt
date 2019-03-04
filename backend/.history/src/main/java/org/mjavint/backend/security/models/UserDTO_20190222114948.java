package org.mjavint.backend.security.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * UserDTO
 */
@Getter
@Setter
@AllArgsConstructor
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 7948124590050197354L;
    private User user;
    private String token;

}