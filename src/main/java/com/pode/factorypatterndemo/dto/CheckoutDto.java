package com.pode.factorypatterndemo.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckoutDto {

    @NotNull
    private String provider;

    @NotNull
    private Double amount;

}
