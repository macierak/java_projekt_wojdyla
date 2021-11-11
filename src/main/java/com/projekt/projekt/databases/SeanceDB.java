package com.projekt.projekt.databases;

import java.util.List;

import com.projekt.projekt.tables.Seance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceDB extends JpaRepository<Seance, Long> {
    List<Seance> findByData(String date);
}
