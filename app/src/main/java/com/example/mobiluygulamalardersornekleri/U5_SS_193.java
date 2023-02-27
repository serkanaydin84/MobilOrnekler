package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_SS_193 extends AppCompatActivity {

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
                U5_Uyg7_Personel personel = new U5_Uyg7_Personel();
                personel.setMaas(maas);
                textView.setText("Maaşınız: " + personel.getMaas());
            }
        });
    }
}
