package com.example.mobiluygulamalardersornekleri.unite6.ss247;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

import java.util.ArrayList;

public class SS_247 extends AppCompatActivity {

    ImageView imageViewGorsel;
    TextView textViewBilgi;
    Button btnIleri, btnGeri;

    Arkadaslar arkadaslar;
    ArrayList<Arkadaslar> arkadaslarArrayList;
    int seciliSiraNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_ss_247);
    }
}
