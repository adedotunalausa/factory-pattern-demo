package com.pode.factorypatterndemo.service.paymentProvidersImpl;

import com.pode.factorypatterndemo.dto.CheckoutDto;
import com.pode.factorypatterndemo.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class InterSwitchImpl implements PaymentService {
    @Override
    public String makePayment(CheckoutDto checkoutDto) {
        return checkoutDto.getAmount() + " payment made successfully using" + checkoutDto.getProvider();
    }
}
