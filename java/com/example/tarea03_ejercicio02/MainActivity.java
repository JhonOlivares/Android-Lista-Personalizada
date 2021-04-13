package com.example.tarea03_ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private  static  final String TAG = "MainActivity";

    ListView listaViewMensajes;
    ListView listaViewGrupos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        //Notificaciones de mensajes
        listaViewMensajes = findViewById(R.id.lv_Mensajes);
        //items mensajes
        Item mensaje1 = new Item("Tono de Notificación", "Melodía predeterminada (Skyline)");
        Item mensaje2 = new Item("Vibración", "Predeterminada");
        Item mensaje3 = new Item("Notificación Emergente", "Nunca mostrar ventana emergente");
        Item mensaje4 = new Item("Luz", "Blanco");

        //arraylist mensajes
        ArrayList<Item> listaMensajes = new ArrayList<>();
        listaMensajes.add(mensaje1);
        listaMensajes.add(mensaje2);
        listaMensajes.add(mensaje3);
        listaMensajes.add(mensaje4);

        ItemListAdapter adapter = new ItemListAdapter(this, R.layout.adapter_view_layout, listaMensajes);
        listaViewMensajes.setAdapter(adapter);




        //Notificaciones de mensajes
        listaViewGrupos = findViewById(R.id.lv_Grupos);
        listaViewGrupos.setAdapter(adapter);


    }
}