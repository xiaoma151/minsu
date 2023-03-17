package com.xm.config;

import com.xm.utils.Result;
import com.xm.utils.XmException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolbalExceptionHandler {

    @ExceptionHandler(XmException.class)
    public Result err(XmException e) {
        return Result.failed(e.getMessage());
    }

}
