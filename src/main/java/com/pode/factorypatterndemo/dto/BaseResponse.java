package com.pode.factorypatterndemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class BaseResponse extends StandardResponse{
    private boolean status;
    private String message;
    private Object data;

    public BaseResponse(boolean status, HttpStatus statusMessage, String message, Object data) {
        super(statusMessage);
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
