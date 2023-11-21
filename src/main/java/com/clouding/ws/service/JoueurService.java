package com.clouding.ws.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clouding.ws.repository.JoueurRepository;
import com.clouding.ws.mapping.Joueur;


@Service
public class JoueurService {
    JoueurRepository jr;

    @Autowired
    public JoueurService(JoueurRepository jr){
        this.jr = jr;
    }
    public List<Joueur> getAllJoueur(){
        return jr.findAll();
    }
}
