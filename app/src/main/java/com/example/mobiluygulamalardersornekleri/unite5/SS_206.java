package com.example.mobiluygulamalardersornekleri.unite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;
import com.example.mobiluygulamalardersornekleri.unite5.uyg10.Asker;
import com.example.mobiluygulamalardersornekleri.unite5.uyg10.Tankci;
import com.example.mobiluygulamalardersornekleri.unite5.uyg10.Topcu;

public class SS_206 extends AppCompatActivity {
    public Asker asker;
    public Tankci tankci;
    public Topcu topcu;

    TextView textViewMesaj;
    Button btnAsker, btnTankci, btnTopcu;
    String mesaj = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_206);

        asker = new Asker();
        tankci = new Tankci();
        topcu = new Topcu();

        textViewMesaj = findViewById(R.id.textViewMesaj);
        btnAsker = findViewById(R.id.btnAsker);
        btnTankci = findViewById(R.id.btnTankci);
        btnTopcu = findViewById(R.id.btnTopcu);

        btnAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });

        btnTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });

        btnTopcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = topcu.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
    }
}
