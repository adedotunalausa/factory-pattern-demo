package com.pode.factorypatterndemo.service;

import com.pode.factorypatterndemo.dto.CheckoutDto;

public interface PaymentService {
    String makePayment(CheckoutDto checkoutDto);
}
