package com.example.barapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbCerveja, cbAgua, cbCigarro, cbVodka, cbCachaca, cbWhisky;


    Button btnPedidoOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbCerveja = findViewById(R.id.cb_Cerveja);
        cbAgua = findViewById(R.id.cb_Agua);
        cbCigarro = findViewById(R.id.cb_Cigarro);
        cbVodka = findViewById(R.id.cb_Vodka);
        cbCachaca = findViewById(R.id.cb_Cachaca);
        cbWhisky = findViewById(R.id.cb_Whisky);
        btnPedidoOK = findViewById(R.id.btn_PedidoOk);

        btnPedidoOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pedido = "";
                if (cbWhisky.isChecked()) {
                    pedido += "1 Whisky \n";

                }
                if (cbCachaca.isChecked()) {
                    pedido += "1 Cachaça \n";

                }
                if (cbVodka.isChecked()) {
                    pedido += "1 Vodka \n";

                }
                if (cbCigarro.isChecked()) {
                    pedido += "1 Cigarro \n";

                }
                if (cbAgua.isChecked()) {
                    pedido += "1 Água \n";

                }
                if (cbCerveja.isChecked()) {
                    pedido += "1 Cerveja \n";

                }
                if (pedido.equals(null)) {
                    Toast.makeText(MainActivity.this, "Pedido Vazio", Toast.LENGTH_SHORT).show();
                } else {
                    Intent it = new Intent(MainActivity.this, SplashScreen.class);
                    it.putExtra("pedido", pedido);
                    startActivity(it);
                    finish();
                }
            }
        });


    }
}