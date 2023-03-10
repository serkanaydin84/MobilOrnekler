package com.example.mobiluygulamalardersornekleri.unite4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class GoldSoru1 extends AppCompatActivity {
    EditText txtSayi, txtCarpimTablosu;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_goldsoru1);

        txtSayi = findViewById(R.id.txtSayi1);
        txtCarpimTablosu = findViewById(R.id.txtTorba1);
    }

    public void btnHesapla (View view) {
        int sayi = Integer.parseInt(txtSayi.getText().toString());

        for (int i = 1; i <= 10; i++) {
            txtCarpimTablosu.setText(txtCarpimTablosu.getText().toString() + "\n" + sayi + " x " + i + " = " + sayi*i);
        }
    }
}