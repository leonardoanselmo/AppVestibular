package com.example.leonardoanselmo.appvestibular;

/**
 * Created by Jackson Carvalho on 30/11/2015.
 */
public class Disciplina {
    private Questoes[] questoes;
    private String nome;

    public Disciplina(Questoes[] questoes, String nome){
        this.questoes = questoes;
        this.nome = nome;
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
}

