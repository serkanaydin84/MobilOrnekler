package com.example.mobiluygulamalardersornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Unite5 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite5);
    }

    // *****************************************************************
    // MODÜL UYGULAMALARI
    // *****************************************************************
    public void btnUyg1(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg1.class);
        startActivity(i);
    }

    public void btnUyg2(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg2.class);
        startActivity(i);
    }

    public void btnUyg3(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg3.class);
        startActivity(i);
    }

    public void btnUyg4(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg4.class);
        startActivity(i);
    }

    public void btnUyg5(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg5.class);
        startActivity(i);
    }

    public void btnUyg6(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg6.class);
        startActivity(i);
    }

    public void btnUyg7(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg7.class);
        startActivity(i);
    }


    // *****************************************************************
    // SIRA SİZDE UYGULAMALARI
    // *****************************************************************
    public void btn_SS165(View view){
        Intent i = new Intent(Unite5.this, U5_SS_165.class);
        startActivity(i);
    }

    public void btn_SS169(View view){
        Intent i = new Intent(Unite5.this, U5_SS_169.class);
        startActivity(i);
    }

    public void btn_SS173(View view){
        Intent i = new Intent(Unite5.this, U5_SS_173.class);
        startActivity(i);
    }

    public void btn_SS188(View view){
        Intent i = new Intent(Unite5.this, U5_SS_188.class);
        startActivity(i);
    }
}
