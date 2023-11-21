package com.clouding.ws.mapping;

import java.util.Date;
// import jakarta.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
// import org.hibernate.annotations.JdbcTypeCode;

@Entity
public class Joueur {
    @Id
    @Column(name = "id", nullable = false)
    int id;
        
    @Column(name = "nom", nullable = false)
    String nom;

    @Column(name = "numero", nullable = false)
    int numero;

    @Column(name = "taille", nullable = false)
    double taille;

    @Column(name = "date_de_naissance", nullable = false)
    // @JdbcTypeCode(SqlTypes.Date)
    Date date_de_naissance;

    @Column(name = "equipe", nullable = false)
    String equipe;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getTaille(){
        return taille;
    }
    public void setTaille(double taille){
        this.taille = taille;
    }
    public Date getDate_de_naissance(){
        return date_de_naissance;
    }
    public void setDate_de_naissance(Date date_de_naissance){
        this.date_de_naissance = date_de_naissance;
    }
    public String getEquipe(){
        return equipe;
    }
    public void setEquipe(String equipe){
        this.equipe = equipe;
    }


    
}
