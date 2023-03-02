package com.example.mobiluygulamalardersornekleri.unite5.uyg7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg7 extends AppCompatActivity {

    EditText txtYas;
    Button btnKaydet;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg7);

        txtYas = findViewById(R.id.txtYas);
        btnKaydet = findViewById(R.id.btnKaydet);
        textView = findViewById(R.id.textViewSonuc);

        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(txtYas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                textView.setText(Integer.toString(personel.getYas()));
            }
        });
    }
}
