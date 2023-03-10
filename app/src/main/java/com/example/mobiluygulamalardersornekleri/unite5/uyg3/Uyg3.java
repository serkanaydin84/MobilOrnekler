package com.example.mobiluygulamalardersornekleri.unite5.uyg3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg3 extends AppCompatActivity {
    Button btn;
    EditText txtSayi1, txtSayi2;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg3);

        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
        textView = findViewById(R.id.textViewK1);
        btn = findViewById(R.id.btnTopla);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1 = Integer.parseInt(txtSayi1.getText().toString());
                int s2 = Integer.parseInt(txtSayi2.getText().toString());

                Integer toplam = topla(s1, s2);
                textView.setText(toplam.toString());
            }
        });
    }

    private int topla(int s1, int s2) {
        return s1 + s2;
    }
}
