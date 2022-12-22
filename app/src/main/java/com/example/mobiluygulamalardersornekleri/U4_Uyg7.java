package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U4_Uyg7 extends AppCompatActivity {

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
