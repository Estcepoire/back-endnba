package com.clouding.ws.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clouding.ws.repository.*;
import com.clouding.ws.mapping.Equipe;
import com.clouding.ws.mapping.Joueur;

@Service
public class EquipeService {
    EquipeRepository er;

    @Autowired
    public EquipeService(EquipeRepository er) {
        this.er = er;
    }

    public List<Equipe> getAllEquipe() {
        return er.findAll();
    }
}
