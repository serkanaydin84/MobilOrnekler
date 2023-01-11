package com.example.mobiluygulamalardersornekleri;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class U4_Uyg9 extends AppCompatActivity {

    EditText txtSayi, txtGosterge;
    int uzunluk;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg9);

        txtSayi = findViewById(R.id.txtSayi1);
        txtGosterge = findViewById(R.id.txtGosterge);
    }

    public void btnCift (View view) {
        txtGosterge.setText("");
        uzunluk = Integer.parseInt(txtSayi.getText().toString());
        for (int i=0; i<=uzunluk; i++) {
            if (i%2 == 0) {
                txtGosterge.setText(txtGosterge.getText() + "\n" + i);
            }
        }
    }

    public void btnTek (View view) {
        txtGosterge.setText("");
        uzunluk = Integer.parseInt(txtSayi.getText().toString());
        for (int i=0; i<=uzunluk; i++) {
            if (i%2 == 1) {
                txtGosterge.setText(txtGosterge.getText() + "\n" + i);
            }
        }
    }

    public void btnTum (View view) {
        txtGosterge.setText("");
        uzunluk = Integer.parseInt(txtSayi.getText().toString());
        for (int i=0; i<=uzunluk; i++) {
            txtGosterge.setText(txtGosterge.getText() + "\n" + i);
        }
    }
}
