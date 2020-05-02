package com.devalex.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalex.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
