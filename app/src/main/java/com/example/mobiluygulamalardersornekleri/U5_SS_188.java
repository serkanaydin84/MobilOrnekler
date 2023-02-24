package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_SS_188 extends AppCompatActivity {

    EditText txtKenar1, txtKenar2, txtKenar3;
    Button btnEskenar, btnIkizKenar, btnCokKenar;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_188);

        txtKenar1 = findViewById(R.id.txtKenar1);
        txtKenar2 = findViewById(R.id.txtKenar2);
        txtKenar3 = findViewById(R.id.txtKenar3);
        btnEskenar = findViewById(R.id.btnEsKenar);
        btnIkizKenar = findViewById(R.id.btnIkizKenar);
        btnCokKenar = findViewById(R.id.btnCokKenar);
        textView = findViewById(R.id.textView);

        btnEskenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar, cevre;
                kenar = Integer.parseInt(txtKenar1.getText().toString());
                U5_SS_188_Ucgen esKenar = new U5_SS_188_Ucgen(kenar);
                cevre = esKenar.cevreHesapla();
                textView.setText(cevre.toString());
            }
        });

        btnIkizKenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar1, kenar2, cevre;
                kenar1 = Integer.parseInt(txtKenar1.getText().toString());
                kenar2 = Integer.parseInt(txtKenar2.getText().toString());
                U5_SS_188_Ucgen ikizKenar = new U5_SS_188_Ucgen(kenar1, kenar2);
                cevre = ikizKenar.cevreHesapla();
                textView.setText(cevre.toString());
            }
        });

        btnCokKenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar1, kenar2, kenar3, cevre;
                kenar1 = Integer.parseInt(txtKenar1.getText().toString());
                kenar2 = Integer.parseInt(txtKenar2.getText().toString());
                kenar3 = Integer.parseInt(txtKenar3.getText().toString());
                U5_SS_188_Ucgen cokKenar = new U5_SS_188_Ucgen(kenar1, kenar2, kenar3);
                cevre = cokKenar.cevreHesapla();
                textView.setText(cevre.toString());
            }
        });

    }
}
