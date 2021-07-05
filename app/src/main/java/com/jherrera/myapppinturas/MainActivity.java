package com.jherrera.myapppinturas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    ArrayList<String> cate = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.listaCategoria);

        //Llenado de arrayList
        cate.add("Arte Abstracto");
        cate.add("Impresionismo");
        cate.add("Subrealismo");

        //Declaracion del adaptador para la visualizacion de la informacion de la lista
        //Llenado de la lista
        AdtaptadorListaP adtaptadorListaP = new AdtaptadorListaP(this,R.layout.lista_personalizada,cate);
        lista.setAdapter(adtaptadorListaP);

        //Metodo para poder activar la funcion de presionar los componenetes de la lista
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this,"A pulsado "+cate.get(position), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MAArte.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,"A pulsado "+cate.get(position), Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(getApplicationContext(),MAArte2.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"A pulsado "+cate.get(position), Toast.LENGTH_SHORT).show();
                        Intent intent3 = new Intent(getApplicationContext(),MAArte3.class);
                        startActivity(intent3);
                        break;
                }

            }
        });

    }
}