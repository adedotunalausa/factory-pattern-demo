package com.pode.factorypatterndemo.controller;

import com.pode.factorypatterndemo.dto.StandardResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

public class BaseController {

    @Autowired
    private HttpServletResponse httpServletResponse;

    <T extends StandardResponse> T respondWithUpdatedHttpStatus(T responseDto) {
        switch (responseDto.getStatusMessage()) {
            case CREATED -> httpServletResponse.setStatus(HttpStatus.CREATED.value());
            case OK -> httpServletResponse.setStatus(HttpStatus.OK.value());
            case NOT_FOUND -> httpServletResponse.setStatus(HttpStatus.NOT_FOUND.value());
            case FORBIDDEN -> httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
            case BAD_REQUEST -> httpServletResponse.setStatus(HttpStatus.BAD_REQUEST.value());
            default -> httpServletResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }

        return responseDto;
    }
}
