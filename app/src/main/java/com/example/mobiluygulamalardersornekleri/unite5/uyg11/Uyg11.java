package com.example.mobiluygulamalardersornekleri.unite5.uyg11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg11 extends AppCompatActivity {

    public Integer[] notlar = new Integer[6];
    public int indis = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg11);

        TextView textViewIndis = findViewById(R.id.textViewIndis);
        TextView textViewToplam = findViewById(R.id.textViewToplam);
        EditText txtTextSayi = findViewById(R.id.txtTextSayi);
        Button btnEkle = findViewById(R.id.btnEkle);
        Button btnSifirla = findViewById(R.id.btnSifirla);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indis < 6) {
                    int sayi = Integer.parseInt(txtTextSayi.getText().toString());
                    notlar[indis] = sayi;
                    indis++;
                    textViewIndis.setText("İndis: " + Integer.toString(indis));
                    int toplam = 0;
                    for (int i = 0; i < indis; i++) {
                        toplam += notlar[i];
                    }
                    textViewToplam.setText("Toplam: " + Integer.toString(toplam));
                    txtTextSayi.getText().clear();
                }
            }
        });

        btnSifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indis = 0;
                textViewIndis.setText("İndis: 0");
                textViewToplam.setText("Toplam: 0");
                notlar = new Integer[6];
                txtTextSayi.getText().clear();
            }
        });
    }
}
