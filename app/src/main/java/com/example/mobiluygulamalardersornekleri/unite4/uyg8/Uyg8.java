package com.example.mobiluygulamalardersornekleri.unite4.uyg8;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg8 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg8);
    }

    @Override
    protected void onResume() {
        super.onResume();

        for (int i=1; i<=100; i+=3) {
            System.out.println(i);
        }
    }
}
