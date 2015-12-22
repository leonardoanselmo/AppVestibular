package com.example.leonardoanselmo.appvestibular;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by everton on 10/11/2015.
 */
public class ActivityQuestaoSelecionada extends AppCompatActivity {
    private Alternativa[] alternativas;

    private List<Questao> questao;
    private Intent intencao;
    private List<Questao> questoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_questao_selecionada);

        TextView textView = (TextView) findViewById(R.id.textView);
        RadioButton botao1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton botao2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton botao3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton botao4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton botao5 = (RadioButton) findViewById(R.id.radioButton5);
        Button resposta = (Button) findViewById(R.id.resposta);

        intencao = getIntent();
        final int indice = intencao.getIntExtra("enunciado", 0);
        questao = Questao.getLista();
        String enunciado = questao.get(indice).getEnuciado();

        textView.setText(String.valueOf(enunciado));

        alternativas = Questao.getAlternativas();
        String alternativa1 = alternativas[0].getResposta();
        String alternativa2 = alternativas[1].getResposta();
        String alternativa3 = alternativas[2].getResposta();
        String alternativa4 = alternativas[3].getResposta();
        String alternativa5 = alternativas[4].getResposta();

        botao1.setText(String.valueOf(alternativa1));
        botao2.setText(String.valueOf(alternativa2));
        botao3.setText(String.valueOf(alternativa3));
        botao4.setText(String.valueOf(alternativa4));
        botao5.setText(String.valueOf(alternativa5));

        resposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Alternativa correta = Questao.verificarAlternativaCorreta();
               /* Toast.makeText(ActivityQuestaoSelecionada.this, correta.getResposta() , Toast.LENGTH_LONG).show();*/
                intencao = new Intent(ActivityQuestaoSelecionada.this, ActivityResolucao.class);
                String resolucao =  questao.get(indice).getResolucao();
                intencao.putExtra("ActivityResolucao",resolucao);
                startActivity(intencao);

                correta = Questao.verificarAlternativaCorreta();
              //  Toast.makeText(ActivityQuestaoSelecionada.this, correta.getResposta() , Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
