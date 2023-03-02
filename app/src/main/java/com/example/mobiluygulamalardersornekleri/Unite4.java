package com.example.mobiluygulamalardersornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.unite4.GoldSoru1;
import com.example.mobiluygulamalardersornekleri.unite4.GoldSoru2;
import com.example.mobiluygulamalardersornekleri.unite4.GoldSoru3;
import com.example.mobiluygulamalardersornekleri.unite4.uyg10.Uyg10;
import com.example.mobiluygulamalardersornekleri.unite4.uyg1.Uyg1;
import com.example.mobiluygulamalardersornekleri.unite4.uyg2.Uyg2;
import com.example.mobiluygulamalardersornekleri.unite4.uyg3.Uyg3;
import com.example.mobiluygulamalardersornekleri.unite4.uyg4.Uyg4;
import com.example.mobiluygulamalardersornekleri.unite4.uyg5.Uyg5;
import com.example.mobiluygulamalardersornekleri.unite4.uyg6.Uyg6;
import com.example.mobiluygulamalardersornekleri.unite4.uyg7.Uyg7;
import com.example.mobiluygulamalardersornekleri.unite4.uyg8.Uyg8;
import com.example.mobiluygulamalardersornekleri.unite4.uyg9.Uyg9;

public class Unite4 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite4);
    }

    public void btnU4Uyg1 (View view) {
        Intent i = new Intent(Unite4.this, Uyg1.class);
        startActivity(i);
    }

    public void btnU4Uyg2 (View view) {
        Intent i = new Intent(Unite4.this, Uyg2.class);
        startActivity(i);
    }

    public void btnU4Uyg3 (View view) {
        Intent i = new Intent(Unite4.this, Uyg3.class);
        startActivity(i);
    }

    public void btnU4Uyg4 (View view) {
        Intent i = new Intent(Unite4.this, Uyg4.class);
        startActivity(i);
    }

    public void btnU4Uyg5 (View view) {
        Intent i = new Intent(Unite4.this, Uyg5.class);
        startActivity(i);
    }

    public void btnU4Uyg6 (View view) {
        Intent i = new Intent(Unite4.this, Uyg6.class);
        startActivity(i);
    }

    public void btnU4Uyg7 (View view) {
        Intent i = new Intent(Unite4.this, Uyg7.class);
        startActivity(i);
    }

    public void btnU4Uyg8 (View view) {
        Intent i = new Intent(Unite4.this, Uyg8.class);
        startActivity(i);
    }

    public void btnU4Uyg9 (View view) {
        Intent i = new Intent(Unite4.this, Uyg9.class);
        startActivity(i);
    }

    public void btnU4Uyg10 (View view) {
        Intent i = new Intent(Unite4.this, Uyg10.class);
        startActivity(i);
    }

    public void btnU4GoldSoru1 (View view) {
        Intent i = new Intent(Unite4.this, GoldSoru1.class);
        startActivity(i);
    }

    public void btnU4GoldSoru2 (View view) {
        Intent i = new Intent(Unite4.this, GoldSoru2.class);
        startActivity(i);
    }

    public void btnU4GoldSoru3 (View view) {
        Intent i = new Intent(Unite4.this, GoldSoru3.class);
        startActivity(i);
    }
}
