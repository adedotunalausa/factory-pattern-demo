package com.pode.factorypatterndemo.controller;

import com.pode.factorypatterndemo.dto.BaseResponse;
import com.pode.factorypatterndemo.dto.CheckoutDto;
import com.pode.factorypatterndemo.service.CheckoutService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/checkout")
public class CheckoutController extends BaseController {
    private final CheckoutService checkoutService;

    @PostMapping
    public BaseResponse performCheckout(@Valid @RequestBody CheckoutDto checkoutDto) {
        return respondWithUpdatedHttpStatus(checkoutService.performCheckout(checkoutDto));
    }
}
