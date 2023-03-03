package com.example.mobiluygulamalardersornekleri.unite5.uyg12;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

import java.util.ArrayList;

public class Uyg12 extends AppCompatActivity {

    Button btnEkle;
    EditText txtAdlar;
    ListView listAdlar;

    ArrayList<String> isimlerListesi = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg12);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, isimlerListesi);
        btnEkle = findViewById(R.id.btnEkle);
        txtAdlar = findViewById(R.id.txtOgrAd);
        listAdlar = findViewById(R.id.listAdlar);

        listAdlar.setAdapter(adapter);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txtAdlar.getText().toString();
                isimlerListesi.add(ad);
                adapter.notifyDataSetChanged();
                txtAdlar.getText().clear();
            }
        });

        listAdlar.setOnItemClickListener(((adapterView, view, i, l) -> {
            isimlerListesi.remove(i);
            adapter.notifyDataSetChanged();
        }));

    }
}
