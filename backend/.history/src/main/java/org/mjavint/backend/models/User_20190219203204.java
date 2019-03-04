package org.mjavint.backend.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("id")
    private Long id;

    @Column("first_name")
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;
    private String role;
    private Integer phone;
    private Date created;
}