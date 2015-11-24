package com.example.leonardoanselmo.appvestibular.Disciplinas;

import com.example.leonardoanselmo.appvestibular.Questoes;

/**
 * Created by Mayara on 23/11/2015.
 */
public class Ingles {
    private Questoes [] questoesIngles;

    public Ingles(Questoes[] questoesIngles) {
        this.questoesIngles = questoesIngles;
    }

    public Questoes[] getQuestoesIngles() {
        return questoesIngles;
    }

    public void setQuestoesIngles(Questoes[] questoesIngles) {
        this.questoesIngles = questoesIngles;
    }
}
