package com.example.mobiluygulamalardersornekleri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.unite6.uyg1.Uyg1;

public class Unite6 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unite6);
    }

    public void btnUyg1(View view) {
        Intent i = new Intent(Unite6.this, Uyg1.class);
        startActivity(i);
    }
}
