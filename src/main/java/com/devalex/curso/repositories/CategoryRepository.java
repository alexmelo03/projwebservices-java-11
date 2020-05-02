package com.devalex.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalex.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
