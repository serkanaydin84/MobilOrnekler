package com.example.mobiluygulamalardersornekleri.unite5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;
import com.example.mobiluygulamalardersornekleri.unite5.uyg7.Personel;

public class SS_193 extends AppCompatActivity {

    EditText txtMaas;
    Button btnKaydet;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_193);

        txtMaas = findViewById(R.id.txtMaas);
        btnKaydet = findViewById(R.id.btnKaydet);
        textView = findViewById(R.id.textViewMaas);

        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int maas = Integer.parseInt(txtMaas.getText().toString());
                Personel personel = new Personel();
                personel.setMaas(maas);
                textView.setText("Maaşınız: " + personel.getMaas());
            }
        });
    }
}
