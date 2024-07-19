package com.webservices.secao12.repositories;

import com.webservices.secao12.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
