package com.pode.factorypatterndemo.service.paymentProvidersImpl;

import com.pode.factorypatterndemo.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaystackImpl implements PaymentService {
    @Override
    public String makePayment() {
        return null;
    }
}
