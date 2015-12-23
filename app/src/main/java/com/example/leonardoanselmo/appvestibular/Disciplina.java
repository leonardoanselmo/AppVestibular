package com.example.leonardoanselmo.appvestibular;

import com.orm.SugarApp;
import com.orm.SugarRecord;
import  com.example.leonardoanselmo.appvestibular.Questao.*;
/**
 * Created by Jackson Carvalho on 30/11/2015.
 */
public class Disciplina extends SugarRecord<Disciplina> {
    private Questao[] questoes;
    private static Disciplina[] lista;
    private String nome;

    public Disciplina() {
    }

    public Questao[] getQuestoes() {
        return questoes;
    }

    public void setQuestoes(Questao[] questoes) {
        this.questoes = questoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static Disciplina[] listaDeNomes(){
        lista = new Disciplina[12];
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        Disciplina d3 = new Disciplina();
        Disciplina d4 = new Disciplina();
        Disciplina d5 = new Disciplina();
        Disciplina d6 = new Disciplina();
        Disciplina d7 = new Disciplina();
        Disciplina d8 = new Disciplina();
        Disciplina d9 = new Disciplina();
        Disciplina d10 = new Disciplina();
        Disciplina d11 = new Disciplina();
        Disciplina d12 = new Disciplina();
        d1.setNome("Portugues");
        lista[0] = d1;
        d2.setNome("Matematica");
        lista[1] = d2;
        d3.setNome("Fisica");
        lista[2] = d3;
        d4.setNome("Biologia");
        lista[3] = d4;
        d5.setNome("Quimica");
        lista[4] = d5;
        d6.setNome("História");
        lista[5] = d6;
        d7.setNome("Geografia");
        lista[6] = d7;
        d8.setNome("Filosofia");
        lista[7] = d8;
        d9.setNome("Sociologia");
        lista[8] = d9;
        d10.setNome("Ingles");
        lista[9] = d10;
        d11.setNome("Espanhol");
        lista[10]=d11;
        d12.setNome("Atualidades");
        lista[11]=d12;
        return lista;
    }
    public static double CalcularRendimento(){
        double questoesCertas=0;
        double questoesErradas=0;
        double totaldequestoes=0;
        double rendimento=0;
        if(Questao.getStatus()==1){
            questoesCertas += 1;
        }else{
            questoesErradas+=1;
        }
        totaldequestoes = questoesCertas+questoesErradas;
       return rendimento=(questoesCertas/totaldequestoes)*100;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }
}

