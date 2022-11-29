package com.pode.factorypatterndemo.service;

import com.pode.factorypatterndemo.enums.PaymentProvider;
import com.pode.factorypatterndemo.factory.PaymentProviderFactoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckoutServiceServiceImpl implements CheckoutService {

    private final PaymentProviderFactoryService paymentProviderFactoryService;

    // currentPaymentProcessor = paystack or interSwitch

    @Override
    public String performCheckout(String providerName) {
        PaymentProvider.validatePaymentProvider(providerName);
        PaymentService currentProvider = paymentProviderFactoryService.getPaymentService(providerName);
        return currentProvider.makePayment();
    }
}
