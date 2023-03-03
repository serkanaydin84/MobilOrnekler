package com.example.mobiluygulamalardersornekleri.unite5;

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

public class SS_214 extends AppCompatActivity {

    Button btnEkle;
    EditText txtOgrAd, txtOgrNo;
    ListView listAdlar;
    ListView listOgrNolar;
    ArrayList<String> isimlerListesi = new ArrayList<>();
    ArrayList<Integer> nolarListesi = new ArrayList<>();
    ArrayAdapter<String> adapterOgrtAd;
    ArrayAdapter<Integer> adapterOgrNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_214);

        adapterOgrtAd = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, isimlerListesi);
        adapterOgrNo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2, nolarListesi);
        btnEkle = findViewById(R.id.btnEkle);
        txtOgrAd = findViewById(R.id.txtOgrAd);
        txtOgrNo = findViewById(R.id.txtOgrNo);
        listAdlar = findViewById(R.id.listAdlar);
        listOgrNolar = findViewById(R.id.listNolar);

        listAdlar.setAdapter(adapterOgrtAd);
        listOgrNolar.setAdapter(adapterOgrNo);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = txtOgrAd.getText().toString();
                Integer no = Integer.parseInt(txtOgrNo.getText().toString());
                isimlerListesi.add(ad);
                nolarListesi.add(no);
                adapterOgrtAd.notifyDataSetChanged();
                adapterOgrNo.notifyDataSetChanged();
                txtOgrAd.getText().clear();
                txtOgrNo.getText().clear();
            }
        });

        listAdlar.setOnItemClickListener(((adapterView, view, i, l) -> {
            isimlerListesi.remove(i);
            adapterOgrtAd.notifyDataSetChanged();
        }));

        listOgrNolar.setOnItemClickListener(((adapterView, view, i, l) -> {
            nolarListesi.remove(i);
            adapterOgrNo.notifyDataSetChanged();
        }));
    }
}
