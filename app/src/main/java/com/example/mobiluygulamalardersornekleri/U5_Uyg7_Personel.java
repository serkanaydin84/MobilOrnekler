package com.example.mobiluygulamalardersornekleri;

import android.util.Log;
import android.widget.Toast;

public class U5_Uyg7_Personel {
    public int yas;

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
