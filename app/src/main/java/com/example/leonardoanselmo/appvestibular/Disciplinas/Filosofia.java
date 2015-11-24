package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by Mayara on 23/11/2015.
 */
public class Filosofia {
    private Questoes[] questoesFilosofia;

    public Filosofia(Questoes[] questoesFilosofia) {
        this.questoesFilosofia = questoesFilosofia;
    }

    public Questoes[] getQuestoesFilosofia() {
        return questoesFilosofia;
    }

    public void setQuestoesFilosofia(Questoes[] questoesFilosofia) {
        this.questoesFilosofia = questoesFilosofia;
    }
}
