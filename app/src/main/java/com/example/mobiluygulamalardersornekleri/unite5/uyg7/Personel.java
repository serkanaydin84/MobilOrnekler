package com.example.mobiluygulamalardersornekleri.unite5.uyg7;

import android.util.Log;

public class Personel {

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
        if (yas < 18 || yas > 55) {
            Log.e("Kapsülleme", "Hatalı Yaş");
            yas = 18;
        }
        this.yas = yas;
    }
}
