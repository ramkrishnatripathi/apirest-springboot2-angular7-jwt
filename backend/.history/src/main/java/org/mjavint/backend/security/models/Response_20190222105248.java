package org.mjavint.backend.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Response
 */
@Getter
@Setter
@AllArgsConstructor
public class Response implements Serializable {

    private static final long serialVersionUID = -341271824880163816L;
    private String message;
}