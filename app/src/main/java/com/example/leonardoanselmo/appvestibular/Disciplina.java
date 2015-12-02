package com.example.leonardoanselmo.appvestibular;

/**
 * Created by Jackson Carvalho on 30/11/2015.
 */
public class Disciplina {
    private String matematica;
    private String portugues;
    private String biologia;
    private String espanhol;
    private String filosofia;
    private String fisica;
    private String geografia;
    private String historia;
    private String ingles;
    private String quimica;
    private String sociologia;
    private  Disciplina [] disciplinas;

    public Disciplina() {

    }

    public String getMatematica() {
        return matematica;
    }

    public void setMatematica(String matematica) {
        this.matematica = matematica;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getBiologia() {
        return biologia;
    }

    public void setBiologia(String biologia) {
        this.biologia = biologia;
    }

    public String getEspanhol() {
        return espanhol;
    }

    public void setEspanhol(String espanhol) {
        this.espanhol = espanhol;
    }

    public String getFilosofia() {
        return filosofia;
    }

    public void setFilosofia(String filosofia) {
        this.filosofia = filosofia;
    }

    public String getFisica() {
        return fisica;
    }

    public void setFisica(String fisica) {
        this.fisica = fisica;
    }

    public String getGeografia() {
        return geografia;
    }

    public void setGeografia(String geografia) {
        this.geografia = geografia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getQuimica() {
        return quimica;
    }

    public void setQuimica(String quimica) {
        this.quimica = quimica;
    }

    public String getSociologia() {
        return sociologia;
    }

    public void setSociologia(String sociologia) {
        this.sociologia = sociologia;
    }
    public Disciplina[] listarDisciplinas(){
        disciplinas = new Disciplina[11];
        Disciplina disciplinas = new Disciplina();
        disciplinas.setBiologia("Biologia");
        disciplinas.setEspanhol("Espanhol");
        disciplinas.setFilosofia("Filosofia");
        disciplinas.setFisica("Física");
        disciplinas.setGeografia("Geográfia");
        disciplinas.setHistoria("História");
        disciplinas.setIngles("Inglês");
        disciplinas.setMatematica("Matemática");
        disciplinas.setPortugues("Português");
        disciplinas.setQuimica("Química");
        disciplinas.setSociologia("Sociologia");

        return new Disciplina[]{disciplinas};
    }
}

