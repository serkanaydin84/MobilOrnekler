package com.example.mobiluygulamalardersornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.unite5.SS_165;
import com.example.mobiluygulamalardersornekleri.unite5.SS_169;
import com.example.mobiluygulamalardersornekleri.unite5.SS_173;
import com.example.mobiluygulamalardersornekleri.unite5.SS_188;
import com.example.mobiluygulamalardersornekleri.unite5.SS_193;
import com.example.mobiluygulamalardersornekleri.unite5.SS_206;
import com.example.mobiluygulamalardersornekleri.unite5.SS_214;
import com.example.mobiluygulamalardersornekleri.unite5.goldsoru1.GoldSoru1;
import com.example.mobiluygulamalardersornekleri.unite5.uyg1.Uyg1;
import com.example.mobiluygulamalardersornekleri.unite5.uyg10.Uyg10;
import com.example.mobiluygulamalardersornekleri.unite5.uyg11.Uyg11;
import com.example.mobiluygulamalardersornekleri.unite5.uyg12.Uyg12;
import com.example.mobiluygulamalardersornekleri.unite5.uyg13.Uyg13;
import com.example.mobiluygulamalardersornekleri.unite5.uyg2.Uyg2;
import com.example.mobiluygulamalardersornekleri.unite5.uyg3.Uyg3;
import com.example.mobiluygulamalardersornekleri.unite5.uyg4.Uyg4;
import com.example.mobiluygulamalardersornekleri.unite5.uyg5.Uyg5;
import com.example.mobiluygulamalardersornekleri.unite5.uyg6.Uyg6;
import com.example.mobiluygulamalardersornekleri.unite5.uyg7.Uyg7;
import com.example.mobiluygulamalardersornekleri.unite5.uyg8.Uyg8;
import com.example.mobiluygulamalardersornekleri.unite5.uyg9.Uyg9;

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
        Intent i = new Intent(Unite5.this, Uyg1.class);
        startActivity(i);
    }

    public void btnUyg2(View view) {
        Intent i = new Intent(Unite5.this, Uyg2.class);
        startActivity(i);
    }

    public void btnUyg3(View view) {
        Intent i = new Intent(Unite5.this, Uyg3.class);
        startActivity(i);
    }

    public void btnUyg4(View view) {
        Intent i = new Intent(Unite5.this, Uyg4.class);
        startActivity(i);
    }

    public void btnUyg5(View view) {
        Intent i = new Intent(Unite5.this, Uyg5.class);
        startActivity(i);
    }

    public void btnUyg6(View view) {
        Intent i = new Intent(Unite5.this, Uyg6.class);
        startActivity(i);
    }

    public void btnUyg7(View view) {
        Intent i = new Intent(Unite5.this, Uyg7.class);
        startActivity(i);
    }

    public void btnUyg8(View view) {
        Intent i = new Intent(Unite5.this, Uyg8.class);
        startActivity(i);
    }

    public void btnUyg9(View view) {
        Intent i = new Intent(Unite5.this, Uyg9.class);
        startActivity(i);
    }

    public void btnUyg10(View view) {
        Intent i = new Intent(Unite5.this, Uyg10.class);
        startActivity(i);
    }

    public void btnUyg11(View view) {
        Intent i = new Intent(Unite5.this, Uyg11.class);
        startActivity(i);
    }

    public void btnUyg12(View view) {
        Intent i = new Intent(Unite5.this, Uyg12.class);
        startActivity(i);
    }

    public void btnUyg13(View view) {
        Intent i = new Intent(Unite5.this, Uyg13.class);
        startActivity(i);
    }


    // *****************************************************************
    // SIRA SİZDE UYGULAMALARI
    // *****************************************************************
    public void btn_SS165(View view){
        Intent i = new Intent(Unite5.this, SS_165.class);
        startActivity(i);
    }

    public void btn_SS169(View view){
        Intent i = new Intent(Unite5.this, SS_169.class);
        startActivity(i);
    }

    public void btn_SS173(View view){
        Intent i = new Intent(Unite5.this, SS_173.class);
        startActivity(i);
    }

    public void btn_SS188(View view){
        Intent i = new Intent(Unite5.this, SS_188.class);
        startActivity(i);
    }

    public void btn_SS193(View view){
        Intent i = new Intent(Unite5.this, SS_193.class);
        startActivity(i);
    }

    public void btn_SS206(View view){
        Intent i = new Intent(Unite5.this, SS_206.class);
        startActivity(i);
    }

    public void btn_SS214(View view){
        Intent i = new Intent(Unite5.this, SS_214.class);
        startActivity(i);
    }


    // *****************************************************************
    // GOLD SORU UYGULAMALARI
    // *****************************************************************
    public void btn_GoldSoru1(View view) {
        Intent i = new Intent(Unite5.this, GoldSoru1.class);
        startActivity(i);
    }
}
