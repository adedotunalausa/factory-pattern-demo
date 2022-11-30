package com.pode.factorypatterndemo.service;

import com.pode.factorypatterndemo.dto.PaymentProviderConfigDto;

public interface PaymentProviderConfigService {
    PaymentProviderConfigDto addConfig(PaymentProviderConfigDto configDto);
    PaymentProviderConfigDto updateConfig(PaymentProviderConfigDto configDto);
}
