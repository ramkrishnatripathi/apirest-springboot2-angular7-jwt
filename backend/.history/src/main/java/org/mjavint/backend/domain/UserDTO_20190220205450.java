package org.mjavint.backend.domain;

import org.mjavint.backend.models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * UserDTO
 */
@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    private User user;
    private String token;

}