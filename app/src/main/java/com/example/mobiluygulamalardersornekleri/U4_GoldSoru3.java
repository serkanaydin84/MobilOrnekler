package com.example.mobiluygulamalardersornekleri;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class U4_GoldSoru3 extends AppCompatActivity {

    EditText txtTorba1, txtTorba2, txtGrupA, txtGrupB, txtGrupC, txtGrupD;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2_goldsoru3);

        txtTorba1 = findViewById(R.id.txtTorba1);
        txtTorba2 = findViewById(R.id.txtTorba2);
        txtGrupA = findViewById(R.id.txtGrupA);
        txtGrupB = findViewById(R.id.txtGrupB);
        txtGrupC = findViewById(R.id.txtGrupC);
        txtGrupD = findViewById(R.id.txtGrupD);

        txtTorba1.setText("Almanya");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "Fransa");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "İngiltere");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "Brezilya");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "Arjantin");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "Belçika");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "İspanya");
        txtTorba1.setText(txtTorba1.getText() + "\n" + "Hırvatistan");

        txtTorba2.setText("TÜRKİYE");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Hollanda");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Fas");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Senegal");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Qatar");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Meksika");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Japonya");
        txtTorba2.setText(txtTorba2.getText() + "\n" + "Suudi Arabistan");
    }

    public void btnKura (View view) {
        Random random = new Random();
        int kura = random.nextInt(16);
        for (int i = 1; i <= 16; i++) {
            if (i % 4 == 0) {

            } else if (i % 4 == 1) {

            } else if (i % 4 == 1) {

            } else {

            }
        }
    }
}