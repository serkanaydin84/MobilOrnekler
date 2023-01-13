package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_SS_181 extends AppCompatActivity {
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

                TextView textK1 = findViewById(R.id.textViewK1);
                TextView textK2 = findViewById(R.id.textViewK2);
                TextView textViewSonuc = findViewById(R.id.textViewSonuc);
                String cihazAdi = txtCihazAdi.getText().toString();
                int kw = Integer.parseInt(txtKWh.getText().toString());
                int saat = Integer.parseInt(txtGunlukSaat.getText().toString());

                U5_Uyg5_ElektrikliCihaz cihaz1 = new U5_Uyg5_ElektrikliCihaz();
                cihaz1.cihazAdi = cihazAdi;
                cihaz1.cihazKW = kw;
                cihaz1.gunlukSaatKullanim = saat;

                double fiyatKademe1 = 0;
                double fiyatKademe2 = 0;
                double fiyatToplam = 0;

                int aylikKullanim = cihaz1.aylikTuketim();
                if (aylikKullanim >= 150) {
                    fiyatKademe1 = cihaz1.aylikFiyatKademe1();
                }

                if (aylikKullanim < 150) {
                    fiyatKademe2 = cihaz1.aylikFiyatKademe2();
                }

                fiyatToplam = fiyatKademe1 + fiyatKademe2;
                textK1.setText(Double.toString(fiyatKademe1));
                textK2.setText(Double.toString(fiyatKademe2));
                textViewSonuc.setText(Double.toString(fiyatToplam));
            }
        });
    }
}
