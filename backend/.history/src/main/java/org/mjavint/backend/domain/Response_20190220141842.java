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

    private String message;
}