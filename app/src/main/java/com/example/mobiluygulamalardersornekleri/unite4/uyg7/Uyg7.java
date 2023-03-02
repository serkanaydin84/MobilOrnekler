package com.example.mobiluygulamalardersornekleri.unite4.uyg7;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class Uyg7 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg7);
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }
}
