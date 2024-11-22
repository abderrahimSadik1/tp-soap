package com.example.tpsoap.repositories;

import org.springframework.data.jpa.repository. JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.tpsoap.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> { }
