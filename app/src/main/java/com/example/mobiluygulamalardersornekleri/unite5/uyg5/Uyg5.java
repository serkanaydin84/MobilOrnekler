package com.example.mobiluygulamalardersornekleri.unite5.uyg5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg5 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg5);




        Button btnHesapla = findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtCihazAdi = findViewById(R.id.txtCihazAdi);
                EditText txtKWh = findViewById(R.id.txtKWh);
                EditText txtGunlukSaat = findViewById(R.id.txtGunlukSaat);

                TextView textViewSonuc = findViewById(R.id.textViewK1);
                String cihazAdi = txtCihazAdi.getText().toString();
                int kw = Integer.parseInt(txtKWh.getText().toString());
                int saat = Integer.parseInt(txtGunlukSaat.getText().toString());

                ElektrikliCihaz cihaz1 = new ElektrikliCihaz();
                cihaz1.cihazAdi = cihazAdi;
                cihaz1.cihazKW = kw;
                cihaz1.gunlukSaatKullanim = saat;

                int sonuc = cihaz1.aylikTuketim();
                textViewSonuc.setText(Double.toString(sonuc));
            }
        });
    }
}
