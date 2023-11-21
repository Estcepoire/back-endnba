package com.clouding.ws.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clouding.ws.mapping.Joueur;

// @Repository
public interface JoueurRepository extends JpaRepository <Joueur, Integer> {    
    // Optional<Joueur> findAllJoueur();
    // Joueur save (Joueur j);
}
