package com.example.mobiluygulamalardersornekleri.unite5.uyg6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg6 extends AppCompatActivity {

    EditText txtKisaKenar, txtUzunKenar;
    Button btnKare, btnDortgen;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg6);

        txtKisaKenar = findViewById(R.id.txtKisaKenar);
        txtUzunKenar = findViewById(R.id.txtUzunKenar);
        btnKare = findViewById(R.id.btnKare);
        btnDortgen = findViewById(R.id.btnDortgen);
        textView = findViewById(R.id.textView);

        btnKare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar, alan;
                kenar = Integer.parseInt(txtKisaKenar.getText().toString());

                Dortgen kare = new Dortgen(kenar);
                alan = kare.alaniBul();
                textView.setText(alan.toString());
            }
        });


        btnDortgen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisaKenar, uzunKenar, alan;
                kisaKenar = Integer.parseInt(txtKisaKenar.getText().toString());
                uzunKenar = Integer.parseInt(txtUzunKenar.getText().toString());

                Dortgen dortgen = new Dortgen(kisaKenar, uzunKenar);
                alan = dortgen.alaniBul();
                textView.setText(alan.toString());
            }
        });
    }
}
