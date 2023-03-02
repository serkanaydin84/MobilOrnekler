package com.example.mobiluygulamalardersornekleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void unite1Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite1.class);
        startActivity(i);
    }

    public void unite2Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite2.class);
        startActivity(i);
    }

    public void unite3Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite3.class);
        startActivity(i);
    }

    public void unite4Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite4.class);
        startActivity(i);
    }

    public void unite5Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite5.class);
        startActivity(i);
    }

    public void unite6Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite6.class);
        startActivity(i);
    }

    public void unite7Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite7.class);
        startActivity(i);
    }

    public void unite8Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite8.class);
        startActivity(i);
    }

    public void unite9Goster (View view) {
        Intent i = new Intent(MainActivity.this, Unite9.class);
        startActivity(i);
    }
}