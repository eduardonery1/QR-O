package com.nery.qr_o;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Entregador extends AppCompatActivity {
    Button main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entregador);
        main_button = findViewById(R.id.main_button);
        final Activity activity = this;

        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES );
                integrator.setPrompt("Leitor da Camera");
                integrator.setCameraId(0);
                integrator.initiateScan();
            }
        });
    }
    protected void OnActivityResult(int requestCode, int resultCode, Intent Data){
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, Data);
        if (result != null){
            if (result.getContents() != null){
                alert("Pedido Entregue");
            }
            else{
                alert("Código Inválido");
            }
        }
        else{
            super.onActivityResult(requestCode, resultCode, Data);
        }
    }
    private void alert(String msg){
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}