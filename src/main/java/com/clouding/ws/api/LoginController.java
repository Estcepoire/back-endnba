package com.clouding.ws.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.clouding.ws.mapping.Equipe;
import com.clouding.ws.mapping.Joueur;
import com.clouding.ws.repository.*;
import com.clouding.ws.service.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    public final JoueurService joueurService;
    public final EquipeService equipeService;

    @Autowired
    public LoginController(JoueurService joueurService, EquipeService equipeService) {
        this.joueurService = joueurService;
        this.equipeService = equipeService;

    }

    @GetMapping("/login")
    @ResponseBody
    public String login() {
        return "AAAA";
    }

    @GetMapping("/test")
    @ResponseBody
    public ResponseEntity<List<Joueur>> getJoueur() {
        List<Joueur> joueurs = joueurService.getAllJoueur();
        return new ResponseEntity<>(joueurs, HttpStatus.OK);
    }

    @GetMapping("/equipe")
    @ResponseBody
    public ResponseEntity<List<Equipe>> getEquipes() {
        List<Equipe> equipes = equipeService.getAllEquipe();
        return new ResponseEntity<>(equipes, HttpStatus.OK);
    }

}