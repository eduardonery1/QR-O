package com.nery.qr_o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Clienteteste extends AppCompatActivity {
    EditText editText;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clienteteste);
        inicializarComponentes();
        clickButton();

    }
    private void clickButton(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "http://localhost:4000/www/qr-o_server/index.php";
                String id = editText.getText().toString();
                Ion.with(Clienteteste.this)
                        .load(URL)
                        .asJsonObject()
                        .setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {
                                try{
                                    gerarQRCode();
                                    Toast.makeText(getApplicationContext(), "Pedido Gerado!", Toast.LENGTH_LONG).show();
                                }
                                catch (Exception Error){
                                    Toast.makeText(getApplicationContext(), "Ops! ALgo deu errado" + Error, Toast.LENGTH_LONG).show();
                                }
                            }
                        });


            }
        });
    }

    private void gerarQRCode(){
        String texto = editText.getText().toString();
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        try{
            BitMatrix bitMatrix = multiFormatWriter.encode(texto, BarcodeFormat.QR_CODE,500,500);
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
            imageView.setImageBitmap(bitmap);
            //return texto;
        }catch (WriterException e){
            e.printStackTrace();
        }

    }

    private void inicializarComponentes(){
        editText = (EditText) findViewById((R.id.editText));
        button = (Button) findViewById((R.id.button));
        imageView = (ImageView) findViewById((R.id.imageView));
    }

}
