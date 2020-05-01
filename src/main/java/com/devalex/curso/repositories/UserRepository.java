package com.devalex.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devalex.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
