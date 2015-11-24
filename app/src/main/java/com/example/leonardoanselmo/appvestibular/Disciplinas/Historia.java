package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by everton on 23/11/2015.
 */
public class Historia {
    private Questoes[] questoesDeHistoria;

    public Historia(Questoes[] questoesDeHistoria) {
        this.questoesDeHistoria = questoesDeHistoria;
    }

    public Questoes[] getQuestoesDeHistoria() {
        return questoesDeHistoria;
    }

    public void setQuestoesDeHistoria(Questoes[] questoesDeHistoria) {
        this.questoesDeHistoria = questoesDeHistoria;
    }
}
