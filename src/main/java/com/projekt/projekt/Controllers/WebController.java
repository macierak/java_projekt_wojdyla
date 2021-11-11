package com.projekt.projekt.Controllers;


import com.projekt.projekt.CurrentUser;
import com.projekt.projekt.loginData;
import com.projekt.projekt.tables.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController{
    @Autowired
    CurrentUser user;

    @Autowired
    DatabaseController database;

    @GetMapping("/")
    public String index(Model model){
        if(user != null){
            model.addAttribute("User", user);
        }
        
        return "index";
    }


    @GetMapping("/login")
    public String login(Model model){
        if(user == null){
            return "login";
        }
        return "index";
    }

    @PostMapping("/login")
    public String login(Model model, loginData data){
        user.setUser(database.login(data.getLogin(), data.getPassword()));
        if(user.getUser().getTyp_konta() == "EMPLOYEE"){}
        return "/index";
    }

    @PostMapping("/zarezerwuj")
    public String postReservation(Model model, Reservation reservation){
        user.addNewReservation(reservation);
        model.addAttribute("User", user);

        return "reservationSuccess";
    }

}
