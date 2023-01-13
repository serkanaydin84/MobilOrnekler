package com.example.mobiluygulamalardersornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Unite4 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite4);
    }

    public void btnU4Uyg1 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg1Activity.class);
        startActivity(i);
    }

    public void btnU4Uyg2 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg2.class);
        startActivity(i);
    }

    public void btnU4Uyg3 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg3.class);
        startActivity(i);
    }

    public void btnU4Uyg4 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg4.class);
        startActivity(i);
    }

    public void btnU4Uyg5 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg5.class);
        startActivity(i);
    }

    public void btnU4Uyg6 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg6.class);
        startActivity(i);
    }

    public void btnU4Uyg7 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg7.class);
        startActivity(i);
    }

    public void btnU4Uyg8 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg8.class);
        startActivity(i);
    }

    public void btnU4Uyg9 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg9.class);
        startActivity(i);
    }

    public void btnU4Uyg10 (View view) {
        Intent i = new Intent(Unite4.this, U4_Uyg10.class);
        startActivity(i);
    }

    public void btnU4GoldSoru1 (View view) {
        Intent i = new Intent(Unite4.this, U4_GoldSoru1.class);
        startActivity(i);
    }

    public void btnU4GoldSoru2 (View view) {
        Intent i = new Intent(Unite4.this, U4_GoldSoru2.class);
        startActivity(i);
    }

    public void btnU4GoldSoru3 (View view) {
        Intent i = new Intent(Unite4.this, U4_GoldSoru3.class);
        startActivity(i);
    }
}
