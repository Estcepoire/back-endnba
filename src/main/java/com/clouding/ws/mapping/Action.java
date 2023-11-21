package com.clouding.ws.mapping;

import javax.persistence.*;

public class Action {
    @Id
    @Column(name = "id", nullable = false)
    int id;
    String nom_joueur;
    int id_match;
    double ppm ;
    double rebon ;
    double pdpm ;
    double minpmatch ;
    double efficacite ;
    double tirmaty ;
    double trois_p ;
    double lance ;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNom_joueur(){
        return nom_joueur;
    }
    public void setNom_joueur(String nom_joueur){
        this.nom_joueur = nom_joueur;
    }
    public int getId_match(){
        return id_match;
    }
    public void setId_match(int id_match){
        this.id_match = id_match;
    }
    public double getPpm(){
        return ppm;
    }
    public void setPpm(double ppm){
        this.ppm = ppm;
    }
    public double getRebon(){
        return rebon;
    }
    public void setRebon(double rebon){
        this.rebon = rebon;
    }
    public double getPdpm(){
        return pdpm;
    }
    public void setPdpm(double pdpm){
        this.pdpm = pdpm;
    }
    public double getMinpmatch(){
        return minpmatch;
    }
    public void setMinpmatch(double minpmatch){
        this.minpmatch = minpmatch;
    }
    public double getEfficacite(){
        return efficacite;
    }
    public void seEefficacite(double efficacite){
        this.efficacite = efficacite;
    }
    public double getTirmaty(){
        return tirmaty;
    }
    public void setTirmaty(double tirmaty){
        this.tirmaty = tirmaty;
    }
    public double getTrois_p(){
        return trois_p;
    }
    public void seTtrois_p(double trois_p){
        this.trois_p = trois_p;
    }
    public double getLance(){
        return lance;
    }
    public void setLance(double lance){
        this.lance = lance;
    }
}
