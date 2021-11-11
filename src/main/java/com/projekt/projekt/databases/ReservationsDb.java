package com.projekt.projekt.databases;

import java.util.List;

import com.projekt.projekt.tables.Reservation;
import com.projekt.projekt.tables.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsDb extends JpaRepository<Reservation, Long> {
    List<Reservation> findByKonto(User user);
}
