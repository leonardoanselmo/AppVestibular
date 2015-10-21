package com.example.leonardoanselmo.appvestibular;

/**
 * Created by leonardoanselmo on 21/10/15.
 */
public class Alternativa {

    private String resposta;
    private boolean respostaCorreta;

    public Alternativa(String resposta, boolean respostaCorreta){
        this.resposta = resposta;
        this.respostaCorreta = respostaCorreta;
    }

    public String getResposta() {
        return resposta;
    }

    public boolean isRespostaCorreta() {
        return respostaCorreta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void setRespostaCorreta(boolean respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

}
