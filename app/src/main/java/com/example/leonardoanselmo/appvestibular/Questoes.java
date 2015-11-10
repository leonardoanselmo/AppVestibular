package com.example.leonardoanselmo.appvestibular;

import java.util.List;

/**
 * Created by leonardoanselmo on 21/10/15.
 */


public class Questoes {

    private String enuciado;
    private List<Alternativa> alternativas;

    public Questoes(String enuciado){
        this.enuciado = enuciado;
    }
    public Alternativa verificarAlternativaCorreta() {
        for (Alternativa alternativa : alternativas) {
            if (alternativa.respostaCorreta()){
                return alternativa;
            }
        }

        return null;
    }

    public String toString(){
        return enuciado;
    }
}
