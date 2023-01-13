package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U5_SS_169 extends AppCompatActivity {

    EditText txtSayi1, txtSayi2;
    Button btnTopla, btnCikar, btnCarp, btnBol;
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss_169);

        int t = 5+10;

    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    private int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }
    private int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
    private int bol(int sayi1, int sayi2) {
        return sayi1 / sayi2;
    }
}
