package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U4_Uyg1Activity extends AppCompatActivity {
    EditText txtNot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg1);
        txtNot = findViewById(R.id.txtSayi1);
    }

    public void kontrolEt(View view) {
        int not = Integer.parseInt(txtNot.getText().toString());

        if (not > 100) {
            Toast.makeText(this, "100'den büyük not girmeyiniz.", Toast.LENGTH_LONG).show();
        }
    }
}
