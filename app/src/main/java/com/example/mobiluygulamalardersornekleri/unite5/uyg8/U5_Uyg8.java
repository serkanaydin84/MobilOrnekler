package com.example.mobiluygulamalardersornekleri.unite5.uyg8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class U5_Uyg8 extends AppCompatActivity {

    TextView textViewBilgi;
    Button btnArabaKapi, btnArabaHiz, btnArabaCalistir, btnArabaIseGit, btnMinibusKapi, btnMinibusHiz, btnMinibusCalistir, btnMinibusYolcuIndir;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg8);

        textViewBilgi = findViewById(R.id.textViewBilgi);
        // ARABA BUTONLARI
        btnArabaKapi = findViewById(R.id.btnArabaKapi);
        btnArabaHiz = findViewById(R.id.btnArabaHiz);
        btnArabaCalistir = findViewById(R.id.btnArabaCalistir);
        btnArabaIseGit = findViewById(R.id.btnArabaIseGit);
        // MİNİBÜS BUTONLARI
        btnMinibusKapi = findViewById(R.id.btnMinibusKapi);
        btnMinibusHiz = findViewById(R.id.btnMinibusHiz);
        btnMinibusCalistir = findViewById(R.id.btnMinibusCalistir);
        btnMinibusYolcuIndir = findViewById(R.id.btnMinibusYolcuIndir);

        // Araba nesnesi oluşturuluyor
        U5_Uyg8_Araba araba = new U5_Uyg8_Araba();
        araba.setKapiSayisi(5);
        araba.setMaksimumHiz(220);

        // Minibüs nesnesi oluşturuluyor
        U5_Uyg8_Minibus minibus = new U5_Uyg8_Minibus();
        minibus.setKapiSayisi(3);
        minibus.setMaksimumHiz(170);

        btnArabaKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.kapiSayisiniGoster());
            }
        });

        btnArabaHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.maksimumHizGoster());
            }
        });

        btnArabaCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.calistir());
            }
        });

        btnArabaIseGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(araba.iseGit());
            }
        });

        btnMinibusKapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.kapiSayisiniGoster());
            }
        });

        btnMinibusHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.maksimumHizGoster());
            }
        });

        btnMinibusCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.calistir());
            }
        });

        btnMinibusYolcuIndir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBilgi.setText(minibus.yolcuIndir());
            }
        });
    }
}
