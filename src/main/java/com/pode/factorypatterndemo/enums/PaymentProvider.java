package com.pode.factorypatterndemo.enums;

import jakarta.validation.ValidationException;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public enum PaymentProvider {
    PAYSTACK("paystack"),
    INTER_SWITCH("interSwitch");

    private final String name;

    private static final Map<String, PaymentProvider> paymentProviderMap = new HashMap<>();

    static {
        for (PaymentProvider paymentProvider: PaymentProvider.values()) {
            paymentProviderMap.put(paymentProvider.name, paymentProvider);
        }
    }

    public static PaymentProvider getByName(String alias) {
        return paymentProviderMap.get(alias);
    }

    public static void validatePaymentProvider(String alias) {
        Arrays.stream(values()).parallel().filter(value -> value.name.equals(alias))
                .findFirst().orElseThrow(() -> new ValidationException("Invalid payment provider"));
    }
}
