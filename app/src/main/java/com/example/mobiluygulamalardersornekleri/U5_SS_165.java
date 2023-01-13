package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_SS_165 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_165);

        btn = findViewById(R.id.btnTopla);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topla();
            }
        });
    }

    private void topla() {
        int sayi1 = 15;
        int sayi2 = 10;
        int topla = sayi1+sayi2;

        Toast.makeText(this, "Toplamı: " + topla, Toast.LENGTH_SHORT).show();
    }
}
