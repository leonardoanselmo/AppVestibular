package com.example.leonardoanselmo.appvestibular;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;

/**
 * Created by Jackson Carvalho on 07/12/2015.
 */
public class ActivityTela_inicial extends AppCompatActivity {

    private  Intent intencao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

       Button botao1=(Button) findViewById(R.id.button);
        botao1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intencao = new Intent(ActivityTela_inicial.this, ActivityListarMaterias.class);
                startActivity(intencao);
            }
        });
    Button boatao2=(Button) findViewById(R.id.button2);
        boatao2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                intencao = new Intent(ActivityTela_inicial.this, ActivityRendimento.class);
                startActivity(intencao);

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





