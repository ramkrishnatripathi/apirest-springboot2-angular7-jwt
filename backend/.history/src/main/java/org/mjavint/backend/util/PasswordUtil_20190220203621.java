package org.mjavint.backend.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * PasswordUtil
 */
public class PasswordUtil {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	public static String getPasswordHash(String password) {
		return null;
	}

}