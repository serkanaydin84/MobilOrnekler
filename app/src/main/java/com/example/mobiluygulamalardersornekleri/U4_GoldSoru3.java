package com.example.mobiluygulamalardersornekleri;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class U4_GoldSoru3 extends AppCompatActivity {

    ListView listTorba1, listTorba2;
    EditText txtGrupA, txtGrupB, txtGrupC, txtGrupD;

    private String[] arrayTorba1 = {"Almanya", "Fransa", "İngiltere", "Brezilya", "Arjantin", "Belçika", "İspanya", "Hırvatistan"};
    private String[] arrayTorba2 = {"TÜRKİYE", "Fas", "Senegal", "Qatar", "Meksika", "Japonya", "Suudi Arabistan"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2_goldsoru3);

        listTorba1 = findViewById(R.id.listTorba2);
        listTorba2 = findViewById(R.id.listTorba2);
        txtGrupA = findViewById(R.id.txtGrupA);
        txtGrupB = findViewById(R.id.txtGrupB);
        txtGrupC = findViewById(R.id.txtGrupC);
        txtGrupD = findViewById(R.id.txtGrupD);

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, arrayTorba1);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_2, android.R.id.text2, arrayTorba2);

        listTorba1.setAdapter(arrayAdapter1);
        listTorba2.setAdapter(arrayAdapter2);
    }

    public void btnKura (View view) {
        Random random = new Random();

        int torba1 = arrayTorba1.length;
        int torba2 = arrayTorba2.length;
        System.out.println(torba1 + torba2);
        int donguSonu = torba1 + torba2;

        for (int i = 1; i <= donguSonu; i++) {
            int kura = random.nextInt(donguSonu);
            if (i % 4 == 0) {

            } else if (i % 4 == 1) {

            } else if (i % 4 == 1) {

            } else {

            }
        }
    }
}