package com.example.barapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResumoPedido extends AppCompatActivity {


    Intent it3;
    TextView textResumoPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);
        textResumoPedido = findViewById(R.id.text_ResumoPedido);
        it3 = getIntent();

        textResumoPedido.setText(it3.getExtras().getString("pedido"));



    }
}