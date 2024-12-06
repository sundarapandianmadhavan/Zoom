package com.teleapps.zoomcustomer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.teleapps.zoomcustomer.model.ResponseMessage;



@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ResponseMessage<Object>> resourceNotFoundException(ResourceNotFoundException ex) {
	    ResponseMessage<Object> message = new ResponseMessage<>(110, ex.getMessage());
	    return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseMessage<Object>> globalExceptionHandler(Exception ex, WebRequest request) {
		ResponseMessage<Object> message = new ResponseMessage<>(111,ex.getMessage());
	    return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(CustomerCreationException.class)
	public ResponseEntity<ResponseMessage<Object>> handleCustomerCreationException(CustomerCreationException ex) {
		ResponseMessage<Object> message = new ResponseMessage<>(112,ex.getMessage());
	    return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseMessage<Object>> handleValidationExceptions(MethodArgumentNotValidException ex) {
		ResponseMessage<Object> message = new ResponseMessage<>(113,ex.getBindingResult().getFieldErrors().get(0).getDefaultMessage());
		 return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
	
}
