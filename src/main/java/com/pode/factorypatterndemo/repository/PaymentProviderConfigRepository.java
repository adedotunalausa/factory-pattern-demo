package com.pode.factorypatterndemo.repository;

import com.pode.factorypatterndemo.model.PaymentProviderConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentProviderConfigRepository extends JpaRepository<PaymentProviderConfig, Long> {
}
