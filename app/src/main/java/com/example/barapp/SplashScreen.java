package com.example.barapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.nio.channels.InterruptedByTimeoutException;

public class SplashScreen extends AppCompatActivity {


    Intent it2;


    String pedido;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        it2 = getIntent();
        pedido = it2.getExtras().getString("pedido");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                it2 = new Intent(SplashScreen.this, ResumoPedido.class);
                it2.putExtra("pedido",pedido);
                startActivity(it2);
                finish();

            }
        }, 4000);

    }
}