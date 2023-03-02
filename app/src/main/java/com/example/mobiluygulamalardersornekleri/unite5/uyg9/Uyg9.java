package com.example.mobiluygulamalardersornekleri.unite5.uyg9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg9 extends AppCompatActivity {

    Button btnUcgen, btnKare;
    EditText txtKenarUzunlugu;
    TextView textViewCevre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg9);

        txtKenarUzunlugu = findViewById(R.id.txtKenarUzunlugu);
        btnUcgen = findViewById(R.id.btnUcgen);
        btnKare = findViewById(R.id.btnKare);
        textViewCevre = findViewById(R.id.textViewCevre);

        btnUcgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunluk = Integer.parseInt(txtKenarUzunlugu.getText().toString());
                Ucgen ucgen = new Ucgen(uzunluk);
                Integer cevre = ucgen.cevre();
                textViewCevre.setText(cevre.toString());
            }
        });

        btnKare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer uzunluk = Integer.parseInt(txtKenarUzunlugu.getText().toString());
                Kare kare = new Kare(uzunluk);
                Integer cevre = kare.cevre();
                textViewCevre.setText(cevre.toString());
            }
        });
    }
}
