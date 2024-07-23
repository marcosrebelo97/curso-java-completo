package com.webservices.secao12.repositories;

import com.webservices.secao12.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
