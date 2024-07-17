package com.webservices.secao12.repositories;

import com.webservices.secao12.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
