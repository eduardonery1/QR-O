package com.nery.qr_o;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irEntregador(View view){
        Intent entregador = new Intent(getApplicationContext(), Entregador.class);
        startActivity(entregador);
    }

    public void irCliente(View view){
        Intent cliente = new Intent(getApplicationContext(), Clienteteste.class);
        startActivity(cliente);
    }
}
