package com.example.mobiluygulamalardersornekleri;

public class U5_Uyg5_ElektrikliCihaz {
    public String cihazAdi;
    public int cihazKW;
    public int gunlukSaatKullanim;

    public int aylikTuketim () {
        int aylikTuketim = cihazKW * gunlukSaatKullanim * 30;
        return aylikTuketim;
    }

    public double aylikFiyatKademe1() {
        double aylikKullanim = cihazKW * gunlukSaatKullanim * 30 * 1.37;
        return aylikKullanim;
    }

    public double aylikFiyatKademe2() {
        double ayKullanim = cihazKW * gunlukSaatKullanim * 30 * 2.07;
        return ayKullanim;
    }
}
