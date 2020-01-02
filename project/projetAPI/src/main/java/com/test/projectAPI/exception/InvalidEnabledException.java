package com.test.projectAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Value must be between 1 and 5")
public class InvalidEnabledException extends RuntimeException {}