package com.example.HibernateSpringCache.repository;

import com.example.HibernateSpringCache.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // No necesitas implementar nada.
    // findAll() ya viene de JpaRepository.
}