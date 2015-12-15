package com.example.leonardoanselmo.appvestibular;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leonardoanselmo on 21/10/15.
 */


public class Questao extends SugarRecord<Questao> {
    private static List<Questao> lista;
    private String enuciado;
    private static Alternativa[] alternativas;
    private String resolucao;
    private static int status;
    //private Disciplina disciplina;

    public Questao(){
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public static Alternativa verificarAlternativaCorreta() {
        for (Alternativa alternativa : alternativas) {
            if (alternativa.respostaCorreta()){
                status = 1;
                return alternativa;
            }else{
                status = 2;
                return alternativa;
            }
        }

        return null;
    }

    public String toString(){
        return enuciado;
    }

    public static List<Questao> listaDeQuestoes(){
        Questao questao = new Questao();
        lista = new ArrayList<>();
        lista = questao.listAll(Questao.class);
        return lista;
    }

    public static void adicionarQuestoes(){
        Questao questao = new Questao();

        questao.setEnuciado("1-Para diminuir o acúmulo de lixo e o desperdício de materiais de valor econômico e, assim, reduzir " +
                "a exploração de recursos naturais, adotou-se, " +
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

        questao.setAlternativas(alternativas);
        questao.setResolucao("As latas de alumínio podem ser submetidas ao processo inicial da formação do lingote de alumínio e,\n" +
                " com isso ser reutilizada entrar em um novo ciclo (reciclagem) para a confecção de novos materiais de alumínio e \n" +
                "não simplesmente ser material reutilizado como nas outras opções. preservando assim a matéria prima bruta e o \n" +
                "meio ambiente.\n" +
                "RESPOSTA CORRETA:\n" +
                "B ");
        questao.setStatus(0);
        questao.save();
    }

    public String getEnuciado() {
        return enuciado;
    }

    public void setEnuciado(String enuciado) {
        this.enuciado = enuciado;
    }

    public static Alternativa[] getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Alternativa[] alternativas) {
        this.alternativas = alternativas;
    }

    public static List<Questao> getLista() {
        lista = listaDeQuestoes();
        return lista;
    }

    public void setLista(List<Questao> lista) {
        this.lista = lista;
    }

    public String diminuirEnuciado(){
        String enuciadoMenor;

        enuciadoMenor = this.enuciado;
        return enuciadoMenor.substring(0,150) + "...";
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
