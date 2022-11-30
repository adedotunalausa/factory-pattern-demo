package com.pode.factorypatterndemo.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Index;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment_provider_config", indexes = {
        @Index(columnList = "config")
})
public class PaymentProviderConfig extends BaseModel {

    @NotNull
    private String config;

    @NotNull
    private String configValue;

    private String reference;

}
