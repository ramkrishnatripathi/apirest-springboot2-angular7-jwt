package org.mjavint.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * JwtAuthentication
 */
@Configuration
public class JwtAuthentication implements AuthenticationEntryPoint, Serializable {

}