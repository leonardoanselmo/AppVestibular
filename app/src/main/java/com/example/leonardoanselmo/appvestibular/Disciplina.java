package com.example.leonardoanselmo.appvestibular;

/**
 * Created by Jackson Carvalho on 30/11/2015.
 */
public class Disciplina {
    private Questoes[] questoes;
    private static Disciplina[] lista;
    private String nome;

    public Disciplina() {
    }

    public Questoes[] getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questoes[] questoes) {
        this.questoes = questoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static Disciplina[] listaDeNomes(){
        lista = new Disciplina[10];
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        Disciplina d3 = new Disciplina();
        Disciplina d4 = new Disciplina();
        Disciplina d5 = new Disciplina();
        Disciplina d6 = new Disciplina();
        Disciplina d7 = new Disciplina();
        Disciplina d8 = new Disciplina();
        Disciplina d9 = new Disciplina();
        Disciplina d10 = new Disciplina();
        d1.setNome("Portugues");
        lista[0] = d1;
        d2.setNome("Matematica");
        lista[1] = d2;
        d3.setNome("Fisica");
        lista[2] = d3;
        d4.setNome("Biologia");
        lista[3] = d4;
        d5.setNome("Quimica");
        lista[4] = d5;
        d6.setNome("História");
        lista[5] = d6;
        d7.setNome("Geografia");
        lista[6] = d7;
        d8.setNome("Filosofia");
        lista[7] = d8;
        d9.setNome("Sociologia");
        lista[8] = d9;
        d10.setNome("Ingles");
        lista[9] = d10;
        return lista;
    }
}

