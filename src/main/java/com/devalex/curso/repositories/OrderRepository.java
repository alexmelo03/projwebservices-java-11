package com.devalex.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalex.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
