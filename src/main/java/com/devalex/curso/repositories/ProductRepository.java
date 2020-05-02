package com.devalex.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalex.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
