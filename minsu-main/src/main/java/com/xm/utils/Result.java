package com.xm.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String message;
    private T data;
    private boolean success;

    public static <T> Result<T> success() {
        return new Result<>(20000, "成功", null, true);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(20000, "成功", data, true);
    }

    public static <T> Result<T> failed(String message) {
        return new Result<>(20001, message, null, false);
    }

    public static <T> Result<T> failed(String message, T data) {
        return new Result<>(20001, message, data, false);
    }
}
