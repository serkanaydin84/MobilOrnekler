package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_SS_173 extends AppCompatActivity {

    EditText txtAd, txtSoyad;
    Button btnMerhaba1, btnMerhaba2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_173);

        txtAd = findViewById(R.id.txtAd);
        txtSoyad = findViewById(R.id.txtSoyad);

        btnMerhaba1 = findViewById(R.id.btnMerhaba1);
        btnMerhaba2 = findViewById(R.id.btnMerhaba2);

        btnMerhaba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txtAd.getText().toString();
                selamVer(ad);
            }
        });

        btnMerhaba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txtAd.getText().toString();
                String soyad = txtSoyad.getText().toString();
                selamVer(ad, soyad);
            }
        });
    }

    private void selamVer(String ad) {
        Toast.makeText(this, "Merhaba: " + ad, Toast.LENGTH_SHORT).show();
    }

    private void selamVer(String ad, String soyad) {
        Toast.makeText(this, "İyi Günler: " + ad + " " + soyad, Toast.LENGTH_SHORT).show();
    }
}
