package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_Uyg3 extends AppCompatActivity {
    Button btn;
    EditText txtSayi1, txtSayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg2);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtSayi1 = findViewById(R.id.txtSayi1);
                txtSayi2 = findViewById(R.id.txtSayi2);
                int s1 = Integer.parseInt(txtSayi1.getText().toString());
                int s2 = Integer.parseInt(txtSayi2.getText().toString());

                int toplam = topla(s1, s2);
                Toast.makeText(getApplicationContext(), "Sayıların Toplamı: " + toplam, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int topla(int s1, int s2) {
        return s1 + s2;
    }
}
