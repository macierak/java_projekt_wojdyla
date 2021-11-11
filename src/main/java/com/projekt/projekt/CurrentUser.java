package com.projekt.projekt;

import java.util.ArrayList;
import java.util.List;

import com.projekt.projekt.tables.Reservation;
import com.projekt.projekt.tables.User;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {
    boolean isLogged = false;

    User user;
    int ID;
    String username;

    CurrentUser(User usr){
        this.user = usr;
        this.ID = usr.getID();
        this.username = usr.getLogin();
    }

    List<Reservation> reservations = new ArrayList<Reservation>();

    public void addNewReservation(Reservation newReservations){
        reservations.add(newReservations);
        
    }

    public void setID(int iD) {
        ID = iD;
    }
    public void setLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
    public int getID() {
        return ID;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
    public User getUser() {
        return user;
    }
    public String getUsername() {
        return username;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
