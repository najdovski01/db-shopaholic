package com.example.db.repository;

import com.example.db.model.ShoppingBag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingBagRepository extends JpaRepository<ShoppingBag, Integer> {
}
