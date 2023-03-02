package com.example.mobiluygulamalardersornekleri.unite5.uyg13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

import java.util.ArrayList;

public class Uyg13 extends AppCompatActivity {

    Oyuncu oyuncu1, oyuncu2;
    Button btnTank1, btnTank2, btnTopcu1, btnTopcu2, btnReset;
    ProgressBar progressBar1, progressBar2;
    TextView textViewIsabet;
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();
    Integer isabet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg13);

        oyuncu1 = new Oyuncu("Oyuncu 1", 100);
        oyuncu2 = new Oyuncu("Oyuncu 2", 100);
        oyuncular.add(oyuncu1);
        oyuncular.add(oyuncu2);

        btnTank1 = findViewById(R.id.btnTankci1);
        btnTank2 = findViewById(R.id.btnTankci2);
        btnTopcu1 = findViewById(R.id.btnTopcu1);
        btnTopcu2 = findViewById(R.id.btnTopcu2);
        btnReset = findViewById(R.id.btnReset);
        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);
        textViewIsabet = findViewById(R.id.textViewIsabet);

        btnTank1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isabet = oyuncu1.tankci.atesEt(oyuncu2);
                progressBar2.setProgress(oyuncu2.getCan());
                textViewIsabet.setText(isabet.toString());
                oyuncuKontrolEt();
            }
        });

        btnTopcu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isabet = oyuncu1.topcu.atesEt(oyuncu2);
                progressBar2.setProgress(oyuncu2.getCan());
                textViewIsabet.setText(isabet.toString());
                oyuncuKontrolEt();
            }
        });

        btnTank2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isabet = oyuncu2.tankci.atesEt(oyuncu1);
                progressBar1.setProgress(oyuncu1.getCan());
                textViewIsabet.setText(isabet.toString());
                oyuncuKontrolEt();
            }
        });

        btnTopcu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isabet = oyuncu2.topcu.atesEt(oyuncu1);
                progressBar1.setProgress(oyuncu1.getCan());
                textViewIsabet.setText(isabet.toString());
                oyuncuKontrolEt();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oyuncu1.setCan(100);
                oyuncu2.setCan(100);
                progressBar1.setProgress(oyuncu1.getCan());
                progressBar2.setProgress(oyuncu2.getCan());
                textViewIsabet.setText("0");
            }
        });
    }

    private void oyuncuKontrolEt() {
        for (Oyuncu oyuncu:oyuncular){
            if (oyuncu.getCan() <= 0)
                textViewIsabet.setText("Oyun Bitti");
        }
    }
}
