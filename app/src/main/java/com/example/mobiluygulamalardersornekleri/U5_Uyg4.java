package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_Uyg4 extends AppCompatActivity {
    EditText txt1, txt2, txt3;
    Button btn2SayiTopla, btn3SayiTopla;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg4);

        txt1 = findViewById(R.id.txtSayi1);
        txt2 = findViewById(R.id.txtSayi2);
        txt3 = findViewById(R.id.txtSayi3);
        textView = findViewById(R.id.textViewK1);
        btn2SayiTopla = findViewById(R.id.btn2Topla);
        btn3SayiTopla = findViewById(R.id.btn3Topla);


        btn2SayiTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());
                int sonuc = topla(sayi1, sayi2);
                textView.setText(Integer.toString(sonuc));
            }
        });

        btn3SayiTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txt1.getText().toString());
                int sayi2 = Integer.parseInt(txt2.getText().toString());
                int sayi3 = Integer.parseInt(txt3.getText().toString());
                int sonuc = topla(sayi1, sayi2, sayi3);
                textView.setText(Integer.toString(sonuc));
            }
        });

    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    private int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
}
