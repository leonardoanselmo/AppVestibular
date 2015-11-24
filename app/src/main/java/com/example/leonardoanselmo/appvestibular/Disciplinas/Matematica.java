package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by Mayara on 23/11/2015.
 */
public class Matematica {
    private Questoes[] questoesMatematica;

    public Matematica(Questoes[] questoesMatematica) {
        this.questoesMatematica = questoesMatematica;
    }

    public Questoes[] getQuestoesMatematica() {
        return  questoesMatematica;
    }

    public void setQuestoesMatematica(Questoes[] questoesMatematica) {
        this. questoesMatematica = questoesMatematica;
    }
}
