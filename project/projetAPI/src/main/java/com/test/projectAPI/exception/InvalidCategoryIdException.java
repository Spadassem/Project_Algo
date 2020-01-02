package com.test.projectAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "categoryids must be a string containing integer ids seperated by a comma")
public class InvalidCategoryIdException extends RuntimeException {
}