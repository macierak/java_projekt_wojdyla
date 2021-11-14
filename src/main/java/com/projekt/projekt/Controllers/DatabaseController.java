package com.projekt.projekt.Controllers;

import java.util.List;

import com.projekt.projekt.databases.EmployeeDB;
import com.projekt.projekt.databases.ReservationsDb;
import com.projekt.projekt.databases.SeanceDB;
import com.projekt.projekt.databases.usersDB;
import com.projekt.projekt.tables.Reservation;
import com.projekt.projekt.tables.Seance;
import com.projekt.projekt.tables.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DatabaseController implements CommandLineRunner {

    @Autowired
    usersDB userDb;
    @Autowired
    ReservationsDb reservationsDb;
    @Autowired
    SeanceDB seansDb;
    @Autowired
    EmployeeDB employeeDb;

    public User login(String im, String naz) {
        List<User> user = userDb.findByLoginAndHasło(im, naz);
        return user.get(0);
    };

    public List<Seance> moviesByDay(String day){
        List<Seance> seans = seansDb.findByData(day);
        return seans;
    }

    public List<Reservation> getUserReservations(User user){
        List<Reservation> reservations = reservationsDb.findByKonto(user);
        return reservations;
    }

    @Override
    public void run(String... args) throws Exception {
        
        
    }
}
