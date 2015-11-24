package com.example.leonardoanselmo.appvestibular;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leonardoanselmo on 21/10/15.
 */


public class Questoes {
    private static Questoes myself = null;;
    private static Questoes[] lista;

    private String enuciado;
    private static Alternativa[] alternativas;

    private Questoes(){
    }

    public static Questoes getInstance(){
        if (myself == null)
            myself = new Questoes();

        return myself;
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

    public static Questoes[] listaDeQuestoes(){
        lista = new Questoes[1];
        Questoes questoes = new Questoes();

        questoes.setEnuciado("1-Para diminuir o acúmulo de lixo e o desperdício de materiais de valor econômico e, assim, reduzir " +
                "a exploração de recursos naturais, adotou-se, \n" +
                "em escala internacional, a política dos três erres: Redução, Reutilização e Reciclagem. Um exemplo de reciclagem é a" +
                " utilização de:");
        alternativas = new Alternativa[5];
        Alternativa alternativa1 = new Alternativa("A- garrafas de vidro retornáveis para cerveja ou refrigerante.",false);
        Alternativa alternativa2 = new Alternativa("B- latas de alumínio como material para fabricação de lingotes.",true);
        Alternativa alternativa3 = new Alternativa("C- sacos plásticos de supermercado como acondicionantes de lixo caseiro.",false);
        Alternativa alternativa4 = new Alternativa("D- embalagens plásticas vazias e limpas para acondicionar outros alimentos.",false);
        Alternativa alternativa5 = new Alternativa("E- garrafas PET recortadas em tiras para fabricação de cerdas de vassouras.",false);
        alternativas[0] = alternativa1;
        alternativas[1] = alternativa2;
        alternativas[2] = alternativa3;
        alternativas[3] = alternativa4;
        alternativas[4] = alternativa5;

        questoes.setAlternativas(alternativas);

        lista[0] = questoes;
        return lista;
    }

    public String getEnuciado() {
        return enuciado;
    }

    public void setEnuciado(String enuciado) {
        this.enuciado = enuciado;
    }

    public Alternativa[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Alternativa[] alternativas) {
        this.alternativas = alternativas;
    }

    public Questoes[] getLista() {
        this.lista = listaDeQuestoes();
        return lista;
    }

    public void setLista(Questoes[] lista) {
        this.lista = lista;
    }

    public String diminuirEnuciado(){
        String enuciadoMenor;

        enuciadoMenor = this.enuciado;
        return enuciadoMenor.substring(0,150) + "...";
    }
}
