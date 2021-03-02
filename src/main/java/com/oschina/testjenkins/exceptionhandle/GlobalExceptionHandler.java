package com.oschina.testjenkins.exceptionhandle;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.UserException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tongcaili
 * @date 2019/7/11 16:42
 */
@Slf4j
@RestControllerAdvice
public class  GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public void handleException(Exception e) {
        log.error("e", e);
    }

    @ExceptionHandler(UserException.class)
    public void userException(UserException e) {

    }


    @ExceptionHandler(IllegalArgumentException.class)
    public void handleDataErrorException(IllegalArgumentException e) {
        log.error("e", e);
    }



    @ExceptionHandler(MissingServletRequestParameterException.class)
    public void handleIMissingServletRequestParameterException(IllegalStateException e) {
        log.error("e", e);
    }


    @ExceptionHandler({MethodArgumentNotValidException.class})
    public void resolveMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        List<String> list = new ArrayList<>();        // 从异常对象中拿到ObjectError对象
        if (!ex.getBindingResult().getAllErrors().isEmpty()) {
            for (ObjectError error : ex.getBindingResult().getAllErrors()) {
                list.add(error.getDefaultMessage());
            }
        }

    }
}
