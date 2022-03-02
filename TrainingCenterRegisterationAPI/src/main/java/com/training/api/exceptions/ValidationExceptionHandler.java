package com.training.api.exceptions;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.http.HttpStatus ;
@RestControllerAdvice
@EnableWebMvc
public class ValidationExceptionHandler {

    @ExceptionHandler(value = { MethodArgumentNotValidException.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public InvalidExceptionResponse methodArgumentNotValidException(Exception ex) {
    	//Getting the Exception message
    	String fullMessage = ex.getMessage();
        int startIndex = fullMessage.lastIndexOf('[');
        int endIndex = fullMessage.lastIndexOf(']');
    	//Getting our default message from Exception Message
        String message = fullMessage.substring(startIndex+1,endIndex-1);
    	return new InvalidExceptionResponse(400, message );
    }
}