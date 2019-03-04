package org.mjavint.backend.exceptions;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UnauthorizedException
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class UnauthorizedException extends RuntimeException {

    private static final long serialVersionUID = -4875545658102115002L;

    protected static MessageSourceAccessor message = SpringSecurityMessageSource.getAccessor();

}