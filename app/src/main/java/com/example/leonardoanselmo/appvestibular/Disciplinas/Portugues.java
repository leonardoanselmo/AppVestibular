package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by everton on 23/11/2015.
 */
public class Portugues {
    private Questoes[] questoesDePortugues;

    public Portugues(Questoes[] questoesDePortugues) {
        this.questoesDePortugues = questoesDePortugues;
    }

    public Questoes[] getQuestoesDePortugues() {
        return questoesDePortugues;
    }

    public void setQuestoesDePortugues(Questoes[] questoesDePortugues) {
        this.questoesDePortugues = questoesDePortugues;
    }
}
