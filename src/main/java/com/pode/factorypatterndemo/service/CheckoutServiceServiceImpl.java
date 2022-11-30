package com.pode.factorypatterndemo.service;

import com.pode.factorypatterndemo.dto.BaseResponse;
import com.pode.factorypatterndemo.dto.CheckoutDto;
import com.pode.factorypatterndemo.enums.PaymentProvider;
import com.pode.factorypatterndemo.factory.PaymentProviderFactoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CheckoutServiceServiceImpl implements CheckoutService {

    private final PaymentProviderFactoryService paymentProviderFactoryService;

    @Override
    public BaseResponse performCheckout(CheckoutDto checkoutDto) {
        try {
            PaymentProvider.validatePaymentProvider(checkoutDto.getProvider());
            PaymentService currentProvider = paymentProviderFactoryService.getPaymentService(checkoutDto.getProvider());
            return new BaseResponse(true, HttpStatus.OK, "Checkout done successfully", currentProvider.makePayment(checkoutDto));
        } catch (Exception e) {
            String message = "There was an error during checkout:::";
            log.error(message, e.getMessage());
            return new BaseResponse(false, HttpStatus.BAD_REQUEST, message, null);
        }
    }
}
