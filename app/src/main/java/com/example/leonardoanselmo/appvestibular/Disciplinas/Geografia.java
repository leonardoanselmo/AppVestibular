package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by Mayara on 23/11/2015.
 */
public class Geografia {
    private Questoes [] questoesGeografia;

    public Geografia(Questoes[] questoesGeografia) {
        this.questoesGeografia = questoesGeografia;
    }

    public Questoes[] getQuestoesGeografia() {
        return questoesGeografia;
    }

    public void setQuestoesGeografia(Questoes[] questoesGeografia) {
        this.questoesGeografia = questoesGeografia;
    }
}
