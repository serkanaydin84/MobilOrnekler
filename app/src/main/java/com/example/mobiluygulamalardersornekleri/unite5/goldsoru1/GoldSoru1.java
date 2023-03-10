package com.example.mobiluygulamalardersornekleri.unite5.goldsoru1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mobiluygulamalardersornekleri.R;

public class GoldSoru1 extends AppCompatActivity {
    DortIslem dortIslem;

    EditText txtSayi;
    String islem = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_goldsoru1);

        dortIslem = new DortIslem();

        txtSayi = findViewById(R.id.txtSayi);
    }

    public void btn0(View view) {
        if (islem.length() == 0){
            dortIslem.setSayi1(0);
        } else {
            dortIslem.setSayi2(0); }
        txtSayi.setText(txtSayi.getText().toString() + 0);
    }

    public void btn1(View view) {
        if (islem.length() == 0){
            dortIslem.setSayi1(1);
        } else {
            dortIslem.setSayi2(1); }
        txtSayi.setText(txtSayi.getText().toString() + 1);
    }

    public void btn2(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(2);
        } else {
            dortIslem.setSayi2(2); }
        txtSayi.setText(txtSayi.getText().toString() + 2);
    }

    public void btn3(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(3);
        } else {
            dortIslem.setSayi2(3); }
        txtSayi.setText(txtSayi.getText().toString() + 3);
    }

    public void btn4(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(4);
        } else {
            dortIslem.setSayi2(4); }
        txtSayi.setText(txtSayi.getText().toString() + 4);
    }

    public void btn5(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(5);
        } else {
            dortIslem.setSayi2(5); }
        txtSayi.setText(txtSayi.getText().toString() + 5);
    }

    public void btn6(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(6);
        } else {
            dortIslem.setSayi2(6); }
        txtSayi.setText(txtSayi.getText().toString() + 6);
    }

    public void btn7(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(7);
        } else {
            dortIslem.setSayi2(7); }
        txtSayi.setText(txtSayi.getText().toString() + 7);
    }

    public void btn8(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(8);
        } else {
            dortIslem.setSayi2(8); }
        txtSayi.setText(txtSayi.getText().toString() + 8);
    }

    public void btn9(View view) {
        if (txtSayi.getText().length() == 0){
            dortIslem.setSayi1(9);
        } else {
            dortIslem.setSayi2(9); }
        txtSayi.setText(txtSayi.getText().toString() + 9);
    }


    public void btnToplama(View view) {
        if (txtSayi.getText().length() != 0){
            txtSayi.setText(txtSayi.getText().toString() + " " + "+");
        }
        islem = "+";
    }

    public void btnCikarma(View view) {
        if (txtSayi.getText().length() != 0){
            txtSayi.setText(txtSayi.getText().toString() + " " + "-");
        }
        islem = "-";
    }

    public void btnCarpma(View view) {
        if (txtSayi.getText().length() != 0){
            txtSayi.setText(txtSayi.getText().toString() + " " + "x");
        }
        islem = "*";
    }

    public void btnBolme(View view) {
        if (txtSayi.getText().length() != 0){
            txtSayi.setText(txtSayi.getText().toString() + " " + "/");
        }
        islem = "/";
    }

    public void btnC(View view) {
        txtSayi.setText("");
        dortIslem.sayi1 = 0;
        dortIslem.sayi2 = 0;
        islem = "";
    }

    public void btnEsittir(View view) {
        System.out.println(islem);
        txtSayi.setText("");
        if (islem == "+")
            dortIslem.toplama();
        else if (islem == "-")
            dortIslem.cikarma();
        else if (islem == "*")
            dortIslem.carpma();
        else if (islem == "/")
            dortIslem.bolme();
        islem = "";
        txtSayi.setText(dortIslem.getSonuc().toString());
    }
}
