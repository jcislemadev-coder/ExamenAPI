package com.krakedev.fitzone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krakedev.fitzone.entidades.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long> {

}