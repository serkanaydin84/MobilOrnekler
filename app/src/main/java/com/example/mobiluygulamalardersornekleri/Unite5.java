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

    public void btnUyg1(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg1.class);
        startActivity(i);
    }

    public void btnUyg2(View view) {
        Intent i = new Intent(Unite5.this, U5_Uyg2.class);
        startActivity(i);
    }

    public void btn_SS165(View view){
        Intent i = new Intent(Unite5.this, U5_SS_165.class);
        startActivity(i);
    }
}
