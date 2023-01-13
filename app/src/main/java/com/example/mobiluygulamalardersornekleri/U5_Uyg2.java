package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_Uyg2 extends AppCompatActivity {
    Button btn;
    EditText txtSayi1, txtSayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg2);

        btn = findViewById(R.id.btnTopla);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int toplam = topla();
                Toast.makeText(getApplicationContext(), "Sayıların Toplamı: " + toplam, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int topla() {
        return 5 + 10;
    }
}
