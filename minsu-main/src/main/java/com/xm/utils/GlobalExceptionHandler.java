package com.xm.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(XmException.class)
    public Result error(XmException e) {
        e.printStackTrace();
        return Result.failed(e.getMessage());
    }

}
