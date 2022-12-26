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

    private ArrayList<String> arrayTorba1 = new ArrayList<String>();
    private ArrayList<String> arrayTorba2 = new ArrayList<String>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2_goldsoru3);

        listTorba1 = findViewById(R.id.listTorba1);
        listTorba2 = findViewById(R.id.listTorba2);
        txtGrupA = findViewById(R.id.txtGrupA);
        txtGrupB = findViewById(R.id.txtGrupB);
        txtGrupC = findViewById(R.id.txtGrupC);
        txtGrupD = findViewById(R.id.txtGrupD);

        arrayTorba1.add("Almanya");
        arrayTorba1.add("Fransa");
        arrayTorba1.add("İngiltere");
        arrayTorba1.add("Brezilya");
        arrayTorba1.add("Arjantin");
        arrayTorba1.add("Belçika");
        arrayTorba1.add("İspanya");
        arrayTorba1.add("Hırvatistan");

        arrayTorba2.add("TÜRKİYE");
        arrayTorba2.add("Fas");
        arrayTorba2.add("Senegal");
        arrayTorba2.add("Qatar");
        arrayTorba2.add("Meksika");
        arrayTorba2.add("Japonya");
        arrayTorba2.add("Suudi Arabistan");
        arrayTorba2.add("Nijerya");


        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, arrayTorba1);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_2, android.R.id.text2, arrayTorba2);

        listTorba1.setAdapter(arrayAdapter1);
        listTorba2.setAdapter(arrayAdapter2);
    }

    public void btnKura (View view) {
        Random random = new Random();

        int torba1 = arrayTorba1.size();
        int torba2 = arrayTorba2.size();
        int donguSonu = torba1 + torba2;

        for (int i = 0; i < donguSonu; i++) {
            int kura = random.nextInt(donguSonu);
            System.out.println("##########" + donguSonu + "***" + kura);

            if (i % 4 == 1) {
                txtGrupA.setText(txtGrupA.getText() + "\n" + arrayTorba1.get(kura));
                txtGrupA.setText(txtGrupA.getText() + "\n" + arrayTorba2.get(kura));

                System.out.println("---" + txtGrupA.getText() + "\n" + arrayTorba1.get(kura));
                System.out.println("---" + txtGrupA.getText() + "\n" + arrayTorba2.get(kura));
                //arrayTorba1.remove(kura);
                //arrayTorba2.remove(kura);
            } else if (i % 4 == 2) {
                txtGrupB.setText(txtGrupB.getText() + "\n" + arrayTorba1.get(kura));
                txtGrupB.setText(txtGrupB.getText() + "\n" + arrayTorba2.get(kura));
                //arrayTorba1.remove(kura);
                //arrayTorba2.remove(kura);
            } else if (i % 4 == 3) {
                txtGrupC.setText(txtGrupC.getText() + "\n" + arrayTorba1.get(kura));
                txtGrupC.setText(txtGrupC.getText() + "\n" + arrayTorba2.get(kura));
                //arrayTorba1.remove(kura);
                //arrayTorba2.remove(kura);
            } else {
                txtGrupD.setText(txtGrupD.getText() + "\n" + arrayTorba1.get(kura));
                txtGrupD.setText(txtGrupD.getText() + "\n" + arrayTorba2.get(kura));
                //arrayTorba1.remove(kura);
                //arrayTorba2.remove(kura);
            }
        }
    }
}