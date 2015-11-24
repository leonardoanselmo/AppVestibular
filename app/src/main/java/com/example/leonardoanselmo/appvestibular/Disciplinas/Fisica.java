package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by Mayara on 23/11/2015.
 */
public class Fisica {
    private Questoes [] questoesFisica;

    public Fisica(Questoes[] questoesFisica) {
        this.questoesFisica = questoesFisica;
    }

    public Questoes[] getQuestoesFisica() {
        return questoesFisica;
    }

    public void setQuestoesFisica(Questoes[] questoesFisica) {
        this.questoesFisica = questoesFisica;
    }
}
