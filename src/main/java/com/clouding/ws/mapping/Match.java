package com.clouding.ws.mapping;

import jakarta.persistence.*
;
public class Match {
    @Id
    @Column(name = "id", nullable = false)
    int id;
    String equipe1;
    String equipe2;
    int score1;
    int score2;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getEquipe1(){
        return equipe1;
    }
    public void setEquipe1(String equipe1){
        this.equipe1 = equipe1;
    }
    public String getEquipe2(){
        return equipe2;
    }
    public void setEquipe2(String equipe2){
        this.equipe2 = equipe2;
    }
    public int getScore1(){
        return score2;
    }
    public void setScore1(int score1){
        this.score1 = score1;
    }
    public int getScore2(){
        return score2;
    }
    public void setScore2(int score2){
        this.score2 = score2;
    }
}
