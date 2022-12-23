package com.example.mobiluygulamalardersornekleri;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U4_GoldSoru2 extends AppCompatActivity {

    EditText txtCift, txtTek, txtSayi;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2_goldsoru2);

        txtSayi = findViewById(R.id.txtSayi);
        txtCift = findViewById(R.id.txtTorba2);
        txtTek = findViewById(R.id.txtTorba1);
    }

    public void btnHesapla (View view) {
        int sayi = Integer.parseInt(txtSayi.getText().toString());
        int topCift = 0, topTek = 0;

        for (int i = 1; i <= sayi; i++) {
            if (i % 2 == 0) {
                topCift += i;
                txtCift.setText(txtCift.getText() + "\n" + topCift);
            } else {
                topTek += i;
                txtTek.setText(txtTek.getText() + "\n" + topTek);
            }
        }

    }
}