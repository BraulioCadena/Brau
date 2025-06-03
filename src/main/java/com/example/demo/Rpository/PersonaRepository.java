package com.example.demo.Rpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Persona;

public interface PersonaRepository  extends JpaRepository <Persona, Long>{

}
