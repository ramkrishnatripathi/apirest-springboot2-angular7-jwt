package org.mjavint.backend.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User
 */
@Entity
@Table(name = "user")
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;
    private String role;
    private Integer phone;
    private Date createdDate;
}