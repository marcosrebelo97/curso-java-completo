package com.webservices.secao12.repositories;

import com.webservices.secao12.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
