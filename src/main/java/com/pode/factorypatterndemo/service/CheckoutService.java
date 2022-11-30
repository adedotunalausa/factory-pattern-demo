package com.pode.factorypatterndemo.service;

import com.pode.factorypatterndemo.dto.BaseResponse;
import com.pode.factorypatterndemo.dto.CheckoutDto;

public interface CheckoutService {
    BaseResponse performCheckout(CheckoutDto checkoutDto);
}
