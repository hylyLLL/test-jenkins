package com.oschina.testjenkins.exceptionhandle;

import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.UserException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE + 1)
@RestControllerAdvice
public class RestExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RuntimeException.class)
    public String userException(RuntimeException e){
        log.error("RuntimeException：{}",e.getMessage());
        return e.getMessage();
    }

    @ExceptionHandler(Exception.class)
    public String userException(Exception e){
        log.error("Exception：{}",e.getMessage());
        return e.getMessage();
    }

/*
    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public void dataIntegrityViolationException(DataIntegrityViolationException e) {
    }*/

}
