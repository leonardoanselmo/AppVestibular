package com.example.leonardoanselmo.appvestibular;

/**
 * Created by Jackson Carvalho on 30/11/2015.
 */
public class Disciplina {
    private Questoes[] questoes;
    private static Disciplina[] lista;
    private String nome;
    private static Disciplina myself = null;

    public static Disciplina getInstance(){
        if (myself == null){
            myself = new Disciplina();
        }
        return myself;
    }

    public Disciplina(Questoes[] questoes, String nome){
        this.questoes = questoes;
        this.nome = nome;
    }

    private Disciplina() {
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
        lista = new Disciplina[1];


        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Matematica");
        disciplina.setNome("Português");
        lista[0] = disciplina;
        return lista;
    }
}

