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
        super();
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

    public List<Questao> listaDeQuestoes(){
        lista = Questao.listAll(Questao.class);
        return lista;
    }

    public static void adicionarQuestoes(){
        Questao questao = new Questao();

        questao.setEnuciado("Um dos problemas ambientais vivenciados pela agricultura hoje em dia é a compactação do solo, devida " +
                "ao intenso tráfego de máquinas cada vez mais pesadas, reduzindo a produtividade das culturas.\n" +
                "Uma das formas de prevenir o problema de compactação do solo é substituir os pneus dos tratores por pneus mais:");

        alternativas = new Alternativa[5];
        Alternativa alternativa1 = new Alternativa("A-largos, reduzindo a pressão sobre o solo.",true);
        Alternativa alternativa2 = new Alternativa("B-estreitos, reduzindo a pressão sobre o solo.",false);
        Alternativa alternativa3 = new Alternativa("C-largos, aumentando a pressão sobre o solo.",false);
        Alternativa alternativa4 = new Alternativa("D-estreitos, aumentando a pressão sobre o solo.",false);
        Alternativa alternativa5 = new Alternativa("E-altos, reduzindo a pressão sobre o solo.",false);
        alternativas[0] = alternativa1;
        alternativas[1] = alternativa2;
        alternativas[2] = alternativa3;
        alternativas[3] = alternativa4;
        alternativas[4] = alternativa5;

        alternativa1.save();
        alternativa2.save();
        alternativa3.save();
        alternativa4.save();
        alternativa5.save();

        questao.setAlternativas(alternativas);
        questao.setResolucao("A pressão deve ser reduzida para prevenir o problema da compactação do solo. A pressão (P) é calculada " +
                "pela razão entre a força normal aplicada (F) e a área de aplicação (A), P = FA. Sendo a alteração no tamanho dos pneus," +
                " estes devem ser mais largos para que aumente a área de aplicação da força e reduza a pressão. A altura do pneu não está" +
                " relacionada à pressão exercida." +
                "RESPOSTA CORRETA:\n" +
                "A");
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
