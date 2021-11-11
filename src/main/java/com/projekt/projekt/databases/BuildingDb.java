package com.projekt.projekt.databases;



import com.projekt.projekt.tables.Building;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingDb extends JpaRepository<Building, Long> {

}
