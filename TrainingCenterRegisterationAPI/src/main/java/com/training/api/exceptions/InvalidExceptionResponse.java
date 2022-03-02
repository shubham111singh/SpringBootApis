package com.training.api.exceptions;

import java.time.LocalTime;

public class InvalidExceptionResponse {
	LocalTime timestamp = LocalTime.now();
	int status   ;
	String error ="Bad Request";
	String message ;
	
	InvalidExceptionResponse(int status , String message){
		this.status = status;
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp.toString();
	}
	public int getStatus() {
		return status;
	}
	public String getError() {
		return error;
	}
	public String getMessage() {
		return message;
	}
}
