package org.mjavint.backend.config;

import java.io.Serializable;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * JwtAuthentication
 */
@Configuration
public class JwtAuthentication implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = 9111520294910769521L;

}