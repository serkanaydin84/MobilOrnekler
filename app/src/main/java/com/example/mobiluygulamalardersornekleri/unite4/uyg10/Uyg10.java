package com.example.mobiluygulamalardersornekleri.unite4.uyg10;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg10 extends AppCompatActivity {

    EditText txtFaktoriyel;
    TextView viewSonuc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg10);

        txtFaktoriyel = findViewById(R.id.txtFaktoriyel);
        viewSonuc = findViewById(R.id.viewSonuc);
    }

    public void btnHesapla (View view) {
        int faktoriyel = Integer.parseInt(txtFaktoriyel.getText().toString());
        int sayac = 1;
        long sonuc = 1;

        while (sayac <= faktoriyel) {
            sonuc = sonuc * sayac;
            sayac++;
        }

        viewSonuc.setText("Sonuç: " + sonuc);
    }
}
