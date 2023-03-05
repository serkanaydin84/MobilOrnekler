package com.example.mobiluygulamalardersornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.unite6.ss247.SS_247;
import com.example.mobiluygulamalardersornekleri.unite6.uyg1.Uyg1;

public class Unite6 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite6);
    }


    // *****************************************************************
    // MODÜL UYGULAMALARI
    // *****************************************************************
    public void btnUyg1(View view) {
        Intent i = new Intent(Unite6.this, Uyg1.class);
        startActivity(i);
    }


    // *****************************************************************
    // SIRA SİZDE UYGULAMALARI
    // *****************************************************************
    public void btn_SS_247(View view) {
        Intent i = new Intent(Unite6.this, SS_247.class);
        startActivity(i);
    }
}
