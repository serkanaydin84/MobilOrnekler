package com.example.mobiluygulamalardersornekleri.unite5.uyg10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg10 extends AppCompatActivity {
    public Asker asker;
    public Tankci tankci;

    TextView textViewMesaj;
    Button btnAsker, btnTankci;
    String mesaj = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg10);

        asker = new Asker();
        tankci = new Tankci();

        textViewMesaj = findViewById(R.id.textViewMesaj);
        btnAsker = findViewById(R.id.btnAsker);
        btnTankci = findViewById(R.id.btnTankci);

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
    }
}
