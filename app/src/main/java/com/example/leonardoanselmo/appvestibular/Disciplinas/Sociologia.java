package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by everton on 23/11/2015.
 */
public class Sociologia {
    private Questoes[] questoesDeSociologia;

    public Sociologia(Questoes[] questoesDeSociologia) {
        this.questoesDeSociologia = questoesDeSociologia;
    }

    public Questoes[] getQuestoesDeSociologia() {
        return questoesDeSociologia;
    }

    public void setQuestoesDeSociologia(Questoes[] questoesDeSociologia) {
        this.questoesDeSociologia = questoesDeSociologia;
    }
}
