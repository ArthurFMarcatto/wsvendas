package com.fmtech.wsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmtech.wsvendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
