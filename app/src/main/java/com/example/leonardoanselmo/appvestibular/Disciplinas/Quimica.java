package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by everton on 23/11/2015.
 */
public class Quimica {
    private Questoes[] questoesDeQuimica;

    public Quimica(Questoes[] questoesDeQuimica) {
        this.questoesDeQuimica = questoesDeQuimica;
    }

    public Questoes[] getQuestoesDeQuimica() {
        return questoesDeQuimica;
    }

    public void setQuestoesDeQuimica(Questoes[] questoesDeQuimica) {
        this.questoesDeQuimica = questoesDeQuimica;
    }
}
