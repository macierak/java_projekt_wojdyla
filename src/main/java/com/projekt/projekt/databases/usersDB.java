package com.projekt.projekt.databases;


import java.util.List;

import com.projekt.projekt.tables.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usersDB extends JpaRepository<User, Long> {
    List<User> findByLoginAndHasło(String im, String naz);
}
