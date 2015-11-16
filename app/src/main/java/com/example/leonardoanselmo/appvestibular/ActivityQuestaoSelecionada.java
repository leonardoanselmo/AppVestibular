package com.example.leonardoanselmo.appvestibular;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by everton on 10/11/2015.
 */
public class ActivityQuestaoSelecionada extends AppCompatActivity {
    private Alternativa[] alternativas;
    private Questoes[] questao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_questao_selecionada);

        TextView textView = (TextView) findViewById(R.id.textView);
        ListView listView = (ListView) findViewById(R.id.listView2);
        Intent intencao = getIntent();
        int indice = intencao.getIntExtra("enunciado", 0);
        questao = Questoes.getInstance().getLista();
        String enunciado = questao[indice].getEnuciado();
        textView.setText(String.valueOf(enunciado));

        alternativas = Questoes.getInstance().getAlternativas();
        ArrayAdapter adapter = new ArrayAdapter(ActivityQuestaoSelecionada.this, android.R.layout.simple_list_item_1, this.alternativas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ActivityQuestaoSelecionada.this, "Resposta Certa: B", Toast.LENGTH_LONG).show();
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
