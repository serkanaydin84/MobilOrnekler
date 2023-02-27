package com.example.mobiluygulamalardersornekleri;

import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class U5_Uyg7_Personel {

    public int yas;
    public int maas;

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas < 4253) {
            Log.e("Kapsülleme", "Hatalı Maaş Girişi");
            maas = 4253;
        }
        this.maas = maas;
    }


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 15 || yas > 55) {
            Log.e("Kapsülleme", "Hatalı Yaş");
            yas = 15;
        }
        this.yas = yas;
    }
}
