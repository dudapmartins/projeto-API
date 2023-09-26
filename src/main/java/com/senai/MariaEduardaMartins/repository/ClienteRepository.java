package com.senai.MariaEduardaMartins.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.MariaEduardaMartins.entities.cliente;

public interface ClienteRepository  extends JpaRepository <cliente, Long>{

}
