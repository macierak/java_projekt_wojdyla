package com.projekt.projekt.tables;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Seans")
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ID;

    String data;

    @ManyToOne
    Room sala;

    @ManyToMany
    Set<Employee> Pracownik;

    public String getData() {
        return data;
    }
    public int getID() {
        return ID;
    }
    public Set<Employee> getPracownik() {
        return Pracownik;
    }
    public Room getSala() {
        return sala;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setPracownik(Set<Employee> pracownik) {
        Pracownik = pracownik;
    }
    public void setSala(Room sala) {
        this.sala = sala;
    }
}
