package com.devalex.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalex.curso.entities.OrderItem;
import com.devalex.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
