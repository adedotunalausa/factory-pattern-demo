package com.pode.factorypatterndemo.factory;

import com.pode.factorypatterndemo.enums.PaymentProvider;
import com.pode.factorypatterndemo.service.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentProviderFactoryService {
    private final Map<String, PaymentService> paymentServiceMap = new HashMap<>();

    public PaymentProviderFactoryService(
            @Qualifier("paystackImpl") PaymentService paystackImpl,
            @Qualifier("interSwitchImpl") PaymentService interSwitchImpl
    ) {
        addProvider(PaymentProvider.PAYSTACK.name(), paystackImpl);
        addProvider(PaymentProvider.INTER_SWITCH.name(), interSwitchImpl);
    }

    public PaymentService getPaymentService(String providerName) {
        return paymentServiceMap.get(providerName);
    }

    private void addProvider(String providerName, PaymentService paymentProvider) {
        paymentServiceMap.put(providerName, paymentProvider);
    }

}
