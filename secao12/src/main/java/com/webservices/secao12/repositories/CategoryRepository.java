package com.webservices.secao12.repositories;

import com.webservices.secao12.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
